object ScalaTutorial  {
	//the main function
	def main(args: Array[String]) 
	{
		//definig variable
		var i=0
		var j=0
        var k=0
        val string="ABCEDEFGH"
        val a_list= List(1,2,3,4,5)
		

        println("while statement")
		//while statement
		while(i<=10)
		{
			println(i)
			i+=1
		}

		//do while statement
		println("do while statement")
		do{
           println(j)
           j+=1
		}while(j<=10)

		//for statement
        println("simple for statement")
		for( k <- 0 to 10) {
			println(k)
		}
         println("looping through String")
		for(  i<- 0 until string.length) 
		{
         println(string(i))
		} 
        

        println("looping through List")
		for( item <- a_list) {
			println("item "+item)
		}


		var evenlist=for{i<-1 to 20
           if(i%2)==0
			} yield i

		for( i <- 0 to evenlist.length) {
		 		println(i)
		 	} 	

		 	//call function
		 	println("executing function ")
		 	show_list
           
	}

	def show_list() = {
		val liste= List(1,2,3,55,77)

		for(  item<-liste )
		{
			if(item==77){
			  
			}
			println(item)
		} 

	}
}