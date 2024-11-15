class Dec2Hex
{
    public static int Arg1;

    public static String convert_toHexadec()
    {

        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem;
	int num;
        num = Arg1;
        String hexadecimal="";

        while(num != 0)
        {
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }
        return hexadecimal;

    }


    public static void main(String args[])    {

        int size = args.length;
        if (size == 0)
        {

            System.out.println("Error. There has not been any input provided."); //Display error message for no input being provided.
            System.exit(0); //Exit the program if there has not been any input provided.

        }
        try
        {

            Arg1 = Integer.parseInt(args[0]); //Try to parse the input(arg1) as an integer

        }catch (NumberFormatException e)
        {

            System.out.println("Error. The input was in an invalid format. Please try again in an appropriate format."); //Display error message for non integer input
            System.exit(0); //Exit the program if input is a non integer.

        }

        
        System.out.println("Converting the Decimal Value " + Arg1 + " to Hex...");


        String hexadecimal = convert_toHexadec();
        
        System.out.println("The hexadecimal representation is: " + hexadecimal);


    }
}
