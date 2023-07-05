package day36_Inheritance.Task_Book;

public class EBook extends Book{

    private int page;
    private String size;

    public void setInfo(String title, String type, String author, double price, String size, int page){
        setInfo(title, type, author, price);
        setSize(size);
        setPage(page);
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void readBook(){
        System.out.println("Reading a book: "+ getTitle());
    }

    public String toString() {
        return "EBook{" +
                " title='" + getTitle() + '\'' +
                ", type='" + getType() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", price= $" + getPrice() +
                ", size='" + size + '\'' +
                " page=" + page +
                '}';
    }
}
/*
	3.2 Create a sub class of Book named EBook:
			variables:
				title, type, author, price, size, pages

			Methods:
				setInfo()
				readBook()
				toString()
 */