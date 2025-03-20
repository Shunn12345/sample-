package takizawa_7321125_2_1;

public class Book {
	// メンバー変数の定義
	String name;//本の名前
	String author;//著者//
	String company;//出版社
	int price;//税抜き価格
	int page;//本のページ数

	// 以下のメソッドが「コンストラクター」
	Book() {
	}

	Book(String initname, String initauthor, String initcompany, int initprice, int initpage) {
		this.name = initname;
		this.author = initauthor;
		this.company = initcompany;
		this.price = initprice;
		this.page = initpage;
	}

	int get_tax_price() {//priceを税込み価格にするメソッド
		double tax_rate = 0.1;
		int tax_price = (int) (this.price + (this.price * tax_rate));//少数切り捨て
		return tax_price;
	}

	String get_book_property() {//propertyの取得
		String property = this.name + "/" + this.author + "/" + this.page + "ページ";
		return property;
	}

	public static void main(String args[]) {
		Book book_1 = new Book("日常の過ごし方", "佐伯博人", "KADOKAWA", 2000, 345);//オブジェクトの生成
		Book book_2 = new Book("野球がうまくなる方法", "飯島博人", "KADOKAW", 700, 200);
		Book book_3 = new Book("サッカーの上達方法", "多田れんじ", "KADOKAW", 222, 242);
		Book book_4 = new Book("バスケの上達方法", "佐藤俊哉", "KADOKAW", 340, 321);
		Book book_5 = new Book("水泳の上達方法", "依田由紀子", "KADOKAW", 211, 356);

		System.out.println(book_1.get_book_property());//プロパティーの出力
		System.out.println(book_2.get_book_property());
		System.out.println(book_3.get_book_property());
		System.out.println(book_4.get_book_property());
		System.out.println(book_5.get_book_property());

		int total_price = book_1.get_tax_price() + book_2.get_tax_price() + book_3.get_tax_price()
				+ book_4.get_tax_price() + book_5.get_tax_price();
		System.out.println("以上の5つの本の税込み価格の合計は" + total_price + "円");

	}
}
