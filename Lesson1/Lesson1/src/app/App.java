package app;

public class App {
    public static void main(String[] args) throws Exception {
        Lesson2();
        
    }

    public static void DoSomething()
    {
        System.out.println("--------------------");
    }

    public static int ComputeNumbers(int number1, int number2)
    {
        return number1 + number2;
    }
    public static void Lesson2()
    {
        int[] myNumberList = {15,37,42,65,97,25};
        int counter = 0;
        int result=0;

        while(counter<myNumberList.length)
        {
            result = result + myNumberList[counter];
            System.out.println(result);
            counter++;
        }

        result = 0;
        for(int i=0;i<myNumberList.length;i++)
        {
            result += myNumberList[i];
            System.out.println(result);

        }

    }
    public static void Lesson1()
    {
        int myNumber = 0;
        double myFloat = 1.2;
        String  myString = "My message here";
        char myChar = 'c';
        int[] myNumberList = {15,37,42,65,97,25};
        
        int number1=1;
        int number2=2;
        int output = (number1 + number2);
        
        if((output>=1)&&(myNumber==0))
        {
            System.out.println("Success");
        }
        else if(output>=1)
        {

        }
        else
        {
            System.out.println("not success booo");
        }

        switch (number1)
            {
                case 0:
                // this one only works when 0
                case 1:
                //statements here
                    break;
                default:
                //else statements
                    break;
            }

        String myOutput = (number1!=1)?"This is output when true":"This is output when false";

        System.out.println(myOutput);
        
        System.out.println(output);

        int outputNumber = ComputeNumbers(number1, number2);
        DoSomething();
        DoSomething();
        System.out.println(outputNumber);

    }
}