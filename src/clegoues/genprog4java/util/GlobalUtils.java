package clegoues.genprog4java.util;

import java.util.ArrayList;
import java.util.List;

import clegoues.genprog4java.rep.WeightedAtom;

public class GlobalUtils {
	// range is inclusive!
	public static ArrayList<Integer> range(int start, int end) {
		ArrayList<Integer> returnVal = new ArrayList<Integer>();
		for(int i=start; i<=end; i++) {
			returnVal.add(i);
		}
		return returnVal;
		
	}
	public static WeightedAtom chooseOneWeighted(List<WeightedAtom> atoms) {
		throw new UnsupportedOperationException();
	}
}
