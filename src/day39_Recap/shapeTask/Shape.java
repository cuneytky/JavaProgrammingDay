package day39_Recap.shapeTask;

public class Shape {

    // variable olusturduk private olursa kontrol edebiliz
    private String name;

    // ihtiyaca gore cağırma durumu gıbı

    public String getName() {
        return name;
    }

    // name in ozelliklerini tanımla
    public void setName(String name) {
        if(name==null){
            System.err.println("name can not be null");
            System.exit(1);// 0 yazarsan err verir 1 yazdık
        }                        // 1: some thing went wrong
        if(name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    // constructorr getir

    public Shape(String name) {
        setName(name);
    }
    // return  ve double ile method verdik
    // fakat her sekılde alan farklı o yuzden tanımlayıp 0 ile donus verdık
    public double area(){
        return 0; //0yazdık
    }
    public double perimeter(){
        return 0;
    }
/*
    // generate den overriding tıkla ve toStringi sec
    @Override
    public String toString() {
        return super.toString();
    }

 */

    // generate ten direk toString cagırıp değişiklik yaptık
    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }

}
/*

Shape:
	variables:
			name

	Encapsulate the field

	Add a constructor to set the filed

	Methods:
		area(){}
		perimeter(){}
 */