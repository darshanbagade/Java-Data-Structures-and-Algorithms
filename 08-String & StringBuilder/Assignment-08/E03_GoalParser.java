public class E03_GoalParser {

        /* public String interpret(String command) {
            command = command.replace("()","o");
            //command = command.replace("(al)","al");
            return command.replace("(al)","al");
        }
        */
    
        //------------OR-------------------------//

        public String interpret(String command){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< command.length() ; i++)
            {
                if(command.charAt(i)=='G') {
                    sb.append('G');
                }
                if(command.charAt(i)=='(')
                {
                    if(command.charAt(i+1)==')') 
                    {
                        sb.append('o');
                    }
                    else{
                        sb.append("al");
                    }
                }
            }    
            return sb.toString();//convert stringBuilder to string
        }
    
    
}
