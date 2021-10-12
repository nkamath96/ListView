# ListView

Built an application with a list of books.

Features :
•	When clicking on one of the books, it will be directed to another page populating the Wikipedia of the book clicked.
•	All the books have an image icon which displays the cover of the book
•	The list of books is scrollable in both portrait and landscape mode


Implementation Details :
1.	BookDetails class : Which holds the book details namely book name and image id.
2.	BookAdapter class : Which will retrieve the BookDetails object along with the book name and the image id to be pulled into the ListView.
3.	MainActivity class : Which will set the adapter and display the list of books to be displayed. And it will call MainActivity2 class when a book is clicked in the list.
4.	MainActivity2 class : Which will load the URL in the WebView based on the book name that was clicked.
5.	Activity_main.xml : Consists of the list view 
6.	Activity_main2.xml : Consists of the Web view
7.	List_layout.xml : Consists of text and image view for displaying the book name and image.
