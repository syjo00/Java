package Generics2;


import java.util.ArrayList;



class Fruit implements Eatable {
	public String toString() {return "Fruits";}
}

class Apple extends Fruit {public String toString() {return "Apple";}}
class Grape extends Fruit {public String toString() {return "Grape";}}
class Toy 						{public String toString() {return "Toy";}}

interface Eatable {}

//제한된 제네릭 클래스
 class Generic_FruitBoxEx2 {
	
	 public static void main(String[] args) {
	 
	 FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
	 FruitBox<Apple> appleBox = new FruitBox<Apple>();
	 FruitBox<Grape> grapeBox = new FruitBox<Grape>();
	 //FruitBox<Grape> grapeBox = new FruitBox<Apple>(); //에러.타입불일치
	 //FruitBox<Toy> grapeBox = new FruitBox<Toy>();//에러
	 
	 fruitBox.add(new Fruit());
	 fruitBox.add(new Apple());
	 fruitBox.add(new Grape());
	 
	 appleBox.add(new Apple());
	 grapeBox.add(new Grape());
	 
	 
	 System.out.println("fruitBox-"+fruitBox);
	 System.out.println("appleBox-"+appleBox);
	 System.out.println("grapeBox-"+grapeBox);
	 
	 /*출력 데이터
	 [Fruit, Apple]
	 [Apple, Apple]
	 [Toy]
 	 */
	 
	 }//main
	 
}

 //Fruit의 자손이면서 Eatable 을 구현한 클래스만 타입 매개변수 T에 대입될 수 있다.
 class FruitBox<T extends Fruit & Eatable> extends Box<T>{}
 
 
 class Box<T>{
	 
	 ArrayList<T> list = new ArrayList<T>();
	 void add(T item) {list.add(item);}
	 T get(int i) {return list.get(i);}
	 int size() {return list.size();}
	 public String toString() {return list.toString();}
	 
	 
 }
 