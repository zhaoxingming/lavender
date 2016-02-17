package lavender.test;

import org.junit.internal.RealSystem;
import org.junit.runner.JUnitCore;

public class Tester {
	
	public static void main(String[] args){
//		String[] classes=new String[]{"lavender.test.Suite02"};
//		JUnitCore jc=new JUnitCore();
//		jc.runMain(new RealSystem(),classes);
//		
		
		System.out.println("------------------------");
		String[] classes2=new String[]{"lavender.test.Suite01","lavender.test.Test03"};
		JUnitCore.runMainAndExit(new RealSystem(),classes2);
	}
}
