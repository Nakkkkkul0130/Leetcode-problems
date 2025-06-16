class Solution {
    public String simplifyPath(String path) {
        String[] div = path.split("/");
        Stack<String> stack = new Stack<>();
        for(String divs : div){
            if(divs.equals(".") || divs.equals("")){
                continue;
            }
            else if(divs.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(divs);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String s : stack){
            sb.append("/").append(s);
        }
        if(sb.length()==0){
            return "/";
        }
        else{
            return sb.toString();
        }
    }
}