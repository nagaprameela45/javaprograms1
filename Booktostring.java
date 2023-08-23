class Book

{

    int Bookid;

    String Bookname;

    String Booktitle;

    int Bookprice;

    Book(int Bookid,String Bookname,String Booktitle,int Bookprice)

    {

        this.Bookid=Bookid;

        this.Bookname=Bookname;

        this.Booktitle=Booktitle;

        this.Bookprice=Bookprice;


    }

    public String toString()

    {

        return Bookid+" "+Bookname+" "+Booktitle+" "+Bookprice;

    }

}

 

 class Booktostring

{

    public static void main(String[] args) {


        Book Book1=new Book(13,"rich dad and poor dad","rich",500);


        System.out.println(Book1);

    }

}