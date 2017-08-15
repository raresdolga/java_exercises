package exsheet1;

class Example1_2{
	private void displayFileContent(String fileName)
	{
		FileInput fileIn=new FileInput(fileName);
		while(fileIn.hasNextLine())
		{
			String s= fileIn.nextLine();
			System.out.println(s);

		}
		fileIn.close();
	}
	private String getFileName()
	{
		Input in=new Input();
		String filename=in.nextLine();
		return filename;
	}
	public void showFile()
	{
		String filename=getFileName();
		displayFileContent(filename);
	}
	public static void main(String [] args)
	{
		System.out.println("Test");
		new Example1_2().showFile();	
	}
}

