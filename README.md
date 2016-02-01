# QuickSort-Simple-Java-Example
Simple Java example of quicksort

This is a sample project to show how quick sort works in a java console application 
Starting Array
2,10,1,8,7,6,5,4,3,9,

Result : 

low=0,High=9,pivot=7
2,10,1,8,7,6,5,4,3,9,
replacing :3,10
replacing :4,8
replacing :5,7
=======================================
low=0,High=5,pivot=1
2,3,1,4,5,6,7,8,10,9,
replacing :1,2
=======================================
low=1,High=5,pivot=4
1,3,2,4,5,6,7,8,10,9,
replacing :4,4
=======================================
low=1,High=2,pivot=3
1,3,2,4,5,6,7,8,10,9,
replacing :2,3
=======================================
low=4,High=5,pivot=5
1,2,3,4,5,6,7,8,10,9,
replacing :5,5
=======================================
low=6,High=9,pivot=8
1,2,3,4,5,6,7,8,10,9,
replacing :8,8
=======================================
low=8,High=9,pivot=10
1,2,3,4,5,6,7,8,10,9,
replacing :9,10
=======================================
1,2,3,4,5,6,7,8,9,10
