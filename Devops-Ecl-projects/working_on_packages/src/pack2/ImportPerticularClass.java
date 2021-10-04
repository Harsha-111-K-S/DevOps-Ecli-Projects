package pack2;
import pack1.FirstPack;
import pack1.FirstPack.FirstInner;


public class ImportPerticularClass {
	public static void main(String args[]) {
		FirstPack fp =new FirstPack();
		FirstInner fi = fp.new FirstInner();
		fi.innerMethod1();
		fi.innerMethod2();
		fp.method1();
		fp.method2();
		
		
	}

}
