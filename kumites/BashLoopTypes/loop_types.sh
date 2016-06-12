#!/bin/bash
# some array
some_arr=('A', 'B', 'C')
# array length
len=${#some_arr[@]}

# for-in loop
echo "For In Loop"

for i in ${some_arr[*]}; do
  printf $i
done

# c-like for loop
echo -e "\nC-Like for Loop"

for((i=0;i<$len;i++)); do
  printf ${some_arr[$i]}
done;

# more c-like for loop
echo -e "\nMore C-like for loop"

for((i=0;i<$len;i++)) { 
  printf ${some_arr[i]}
}

# while loop
i=0
echo -e "\nWhile loop"

while [ $i -lt $len ]; do
  printf ${some_arr[$i]}
  let i+=1
done;

# until loop
j=0
echo -e "\nUntil loop"

until [ $j -ge $len ]; do
  printf ${some_arr[$j]}
  let j+=1
done

echo "THE END"