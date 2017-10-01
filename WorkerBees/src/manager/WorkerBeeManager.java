/**
 * 
 */
package manager;

import user.Job;

/**
 * @author Madeline
 * @author Cassie
 *
 */
public class WorkerBeeManager {

	/** List of all jobs */
	Job[] jobList;
	/** List of jobs filtered by parameters */
	Job[] matchList;
	/** List of parameters */
	Object[] paramList;
	/** Holds the number of parameter hits */
	int[] paramMatch;
	
	/** Loads the list of jobs 
	 * I havent done this method yet btw - Cassie 
	 * */
	public Job[] loadList(Job[] joblist) {
		//load the jobList w/ inputed jobs
		return joblist;
	}
	
	/** Gets the list of matched jobs from given parameters */
	public Job[] getMatch(Object... tomatch) {
		int i = 0;
		for (Object o : tomatch) { 
			paramList[i] = tomatch[i];
			i++;
		}
		int jListSize = jobList.length;
		
		for (int j = 0; j < jListSize; j++) {
			if ( (paramList[0] != null) && (jobList[i].getType().equalsIgnoreCase((String) paramList[0]))  ) {
				paramMatch[i] = paramMatch[i]++;
			}
			if ( (paramList[1] != null) && (jobList[i].getCategory().equalsIgnoreCase((String)paramList[1] ))) {
				paramMatch[i] = paramMatch[i]++;
			}
			if ( (paramList[2] != null) && (jobList[i].getWage() == ((int)paramList[2] ))) {
				paramMatch[i] = paramMatch[i]++;
			}
			if ( (paramList[3] != null) && (jobList[i].getHours() == ((int)paramList[3] ))) {
				paramMatch[i] = paramMatch[i]++;
			}
			if ( (paramList[3] != null) && (jobList[i].getAddress() == ((String)paramList[4] ))) {
				paramMatch[i] = paramMatch[i]++;
			}
			
			if (paramMatch[i] == paramList.length) {
				matchList[i] = jobList[i];
			}
		}
		return matchList;
		
	}
}
