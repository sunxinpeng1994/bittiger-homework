public class Solution {
    public String simplifyPath(String path) {
        //corner case
        if(path == null || path.length() == 0){
            return "/";
        }
        //core logic
        String[] strOne = path.trim().split("/+");
        Stack<String> temp = new Stack<String>();
        Stack<String> res = new Stack<String>();
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < strOne.length; i++){
            if(!strOne[i].equals("..") && !strOne[i].equals(".") && !strOne[i].equals("")){
	        	temp.push(strOne[i]);
            }
            if(strOne[i].equals("..") && !temp.isEmpty()){
                temp.pop();
            }
        }
        while(!temp.isEmpty()){
	    	res.push(temp.pop());
	    }
	    while(!res.isEmpty()){
	    	ans.append('/');
	    	ans.append(res.pop());
	    }
        return ans.length()==0 ? "/" : ans.toString();
    }
}