class Edge:
    def __init__(self,id,u,v,value):
        self.u=u
        self.v=v
        self.value=value
        self.id=id

def quick_sort_edges(edges,left,right):
    if left >= right:
        return
    low = left
    high = right
    key = edges[low]
    while left < right:
        while left < right and edges[right].id > key.id:
            right -= 1
        edges[left] = edges[right]
        while left < right and edges[left].id <= key.id:
            left += 1
        edges[right] = edges[left]
    edges[right] = key
    quick_sort_edges(edges, low, left - 1)
    quick_sort_edges(edges, left + 1, high)

def sort_edges(edges):
    quick_sort_edges(edges,0,len(edges)-1)
    return edges

def find_charming(edges,s,t,numOfV):
    MAX=100000
    count = MAX

    pi=[{} for i in range(numOfV+1)]
    sort_edges(edges)
    for e in edges:
        if(e.u)!=s:
            pi[e.v][e.id]=MAX
        else:
            pi[e.v][e.id]=e.value

    for e in edges:
        from_list=pi[e.u]
        to_list=pi[e.v]
        for k in from_list.keys():
            if k<e.id:
                temp_value=from_list[k]+e.value
                if temp_value<to_list[e.id]:
                    pi[e.v][e.id]=temp_value

    path=pi[t]

    for v in path.values():
        if v<count:
            count=v
    if count==MAX:
        return 'NO charming paths.'
    return count,pi



edges=[
    Edge(5,1,3,5),
    Edge(2,3,5,3),
    Edge(3,1,4,1),
    Edge(11,6,2,2),
    Edge(1,5,7,2),
    Edge(10,5,6,2),
    Edge(7,7,2,2),
    Edge(8,4,5,2)
]
print(find_charming(edges,1,2,7))