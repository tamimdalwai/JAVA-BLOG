package PackageMain;
import PackageSample.*;

// OUTER CLASS FROM SAME SOURCE FILE

class Sample{
	void method(){
		System.out.println("method executed from Same source file level OUTER CLASS");
	}
}

class Main{
	// CLASS LEVEL INNER CLASS
	/*static class Sample{
		void method(){
			System.out.println("method executed from CLASS LEVEL INNER CLASS");
		}
	}*/
	public static void main(String[] args){
		//LOCAL METHOD LEVEL INNER CLASS
		/*class Sample{
			void method(){
				System.out.println("method executed from METHOD LEVEL INNER CLASS");
			}
		}*/
		Sample s1 = new Sample();
		System.out.println("main method execution started");
		s1.method();
		System.out.println("main method execution ended");
	}
}