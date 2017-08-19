Docker Java Application Example
===============================
1) Create a directory
	Directory is required to organize files. Create a director by using the following command.
	$ mkdir  java-docker-app  
2) Create a Java File
	Now create a Java file. Save this file as Hello.java file.
	// Hello.java

		class Hello {  
			public static void main(String[] args){  
				System.out.println("This is java app \n by using Docker");  
			}  
		}  
	Save it inside the directory java-docker-app as Hello.java.
3) Create a Dockerfile
	After creating a Java file, we need to create a Dockerfile which contains instructions for the Docker. Dockerfile does not contain any file extension. So, save it simple with Dockerfile name.

	// Dockerfile
		FROM java:8  
		COPY . /var/www/java  
		WORKDIR /var/www/java  
		RUN javac Hello.java  
		CMD ["java", "Hello"]
4) Build Docker Image
	After creating Dockerfile, we are changing working directory.
	$ cd   java-docker-app 
	
	Now, create an image by following the below command. we must login as root in order to create an image. In this example, we have switched to as a root user. In the following command, java-appis name of the image. We can have any name for our docker image.
	$ docker build -t java-app . 
5) Run Docker Image
	After creating image successfully. Now we can run docker by using run command. The following command is used to run java-app.
	$ docker run java-app