package Chapter_16_Interpreter.sample02;

class Client {
    public static void main(String args[]) {  
        String instruction = "up move 5 and down run 10 and left move 5";  
        InstructionHandler handler = new InstructionHandler();  
        handler.handle(instruction);  
        String outString = handler.output();
        System.out.println(outString);  
    }  
}