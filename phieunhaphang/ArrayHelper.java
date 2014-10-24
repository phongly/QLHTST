/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phieunhaphang;

import java.util.ArrayList;
import java.util.Arrays;
 
public class ArrayHelper {
 
// 
//  private void process() {
// 
//	Object[] obj = new Object[] { "a", "b", "c" };
// 
//	System.out.println("Before Object [] ");
//	for (Object temp : obj) {
//		System.out.println(temp);
//	}
// 
//	System.out.println("\nAfter Object [] ");
//	Object[] newObj = appendValue(obj, "new Value");
//	for (Object temp : newObj) {
//		System.out.println(temp);
//	}
// 
//  }
 
  public static Object[] appendValue(Object[] obj, Object newObj) {
 
	ArrayList<Object> temp = new ArrayList<Object>(Arrays.asList(obj));
	temp.add(newObj);
	return temp.toArray();
 
  }
 
}