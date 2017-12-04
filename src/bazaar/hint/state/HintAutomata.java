package bazaar.hint.state;

import java.util.ArrayList;
import java.util.HashMap;

import weka.core.Instance;

public class HintAutomata {
	
	HashMap<String,String> rewards;
	HashMap<String,String> transition;
	
	public HintAutomata() {
		
	}
	
	public String getRewards(HashMap<String,String> evidence,  String action) {
		String output = "";
		
		try {
			String state = StateDecipherer.getState(evidence);
			double[] dist = classifier.distributionForInstance(firstInstance);
			
			for (int i=0; i<dist.length; i++) {
				if (actions.contains(""+i)) {
					output += (output.equals("")) ? ""+dist[i] : ","+dist[i];

				} else {
					output += (output.equals("")) ? "0" : ",0";
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}

		return output;
	}
}
