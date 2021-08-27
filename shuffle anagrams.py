t = int(input())
def perm(word,length,origin,position):
    ar=[]
    if length==0:
        #print(word)
        return [word]
        
    for i in range(length):
        subword=word[:i]+word[i+1:]
        letter=word[i]
        if letter==origin[position]:
            continue
        #print(type(word[i]))
        #print(type(perm(subword,length-1,origin,position+1)))
        else:
            listw=perm(subword,length-1,origin,position+1)
            for i in range(len(listw)):
                word=letter+listw[i]
                ar.append(word)
                #print(word)
    return ar
    
for test in range(t):
    S=input()
    arr=perm(S,len(S),S,0)
    if len(arr)==0:
        print("IMPOSSIBLE")
    else:
        print(arr[0])
        
        
    
    
