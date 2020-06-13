学习笔记


第三课：数组，链表，跳表
Array 访问 O(1) 
Linked List
跳表：Skip list
跳表的特点：
只能用于链表有序的情况
所以，跳表对标的是平衡树（AVL Tree)和二分查找，
是一种 插入/删除/搜索 都是o(log n)的数据结构

它最大的优势是原理简单，容易实现，方便扩展，效率更高。
因此 在一些热门项目中用来替代平衡树，如Redis，LevelDB等。



第四课：栈，队列，优先队列，双端队列



Stack： 先入后出  添加，删除 O(1)   查询 O(n)
Queue： 先入先出  添加，删除 O(1)   查询 O(n)

Deque:Double-End  Queue 双端队列
简单队列：头和尾都可以进行元素的pop和push 
插入和删除 O(1)  查询O(n)

Priority Queue:
1.插入操作：O(1)
2.取出操作：O(logN) -按照元素的优先级取出
3.底层具体实现的数据结构较为多样和复杂：heap（不同形式的堆） bst(二叉搜索树) treap