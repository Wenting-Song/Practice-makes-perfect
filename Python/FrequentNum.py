
def frequent(list):
    dic = {}
    for num in list:
        if num in dic:

            dic[num] += 1
        else:
            dic[num] = 1

    counter = 0
    for key in dic.keys():
        if dic[key] > counter:
            counter = dic[key]


    for key, value in dic.items():
        if value == counter:
          print(key)

a = [1,1,1,1,1,1,1,1,2,2,2,2,3,3,3,4,4,5]
frequent(a)
