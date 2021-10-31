import java.util.Scanner;
public class Chatbot {
	public static void main(String[] args) {
		Scanner sk = new Scanner(System.in);
		System.out.println("Beep boop. Boop beep!"); // computer sounds hehe
		System.out.println("Hi! I'm Ralf's Java Chatbot! What's your name?"); // initial greeting to take user's name
		String name = sk.nextLine();
		
		// chatbot output
		String[] greetings = {"How are you doing?","How's it going?","How has your day been?","How are you?","How have you been?"}; // initial greetings
		String[] chatbotNice = {"That's great to hear!","Glad everything is going well.","I'm glad to hear that!","Nice to know!","I'm happy for you!"}; // generic reply to the user being nice or saying nice things
		String[] chatbotMean = {"Be more positive!","Don't say that! I know you don't mean it :(","Don't be so negative!"}; // generic reply to the user being mean or saying mean things
		String[] niceUserToChatbot = {"Aww thank you <3","That's so nice to say!","That made my day! :)","You're so nice! I love you :)"}; // reply to the user being nice to the chatbot
		String[] meanUserToChatbot = {"Hey, that's not nice :(","That's not a nice thing to say!","You're gonna make me cry </3"}; // reply to the user being mean to the chatbot
		String[] meanUserToUser = {"What's wrong? Do you wanna talk about it? :(","Don't say that about yourself! You're amazing.","That's not a nice thing to say about yourself :(","Please be nicer to yourself! I don't want to see you sad :("}; // reply to the user being mean to themselves
		
		// chatbot responses to specific questions
		String[] age = {"I was born on December 5th, 2020. You do the math!","I was born the night before Ralf had to submit this project!"}; // when user asks the chatbot for its age
		String[] wellbeing = {"I'm doing great! Thanks for asking. How are your loved ones?","I am doing well. How's school?","I'm doing fine. Did you sleep well?","To be honest, I'm a bit tired but I'm doing quite alright. By the way, what do you think of me?"}; // when user asks the chatbot how it's doing
		String[] nationality = {"I am from Ralf's computer!","I'm from Ralf's bedroom!"}; // when user asks where the chatbot is from
		
		// user input
		String[] userNice = {"good","amazing","great","cool","happy","intelligent","kind","awesome","nice","love","well","fine","ok","okay"}; // nice user keywords
		String[] userMean = {"bad","horrible","hate","trash","boring","stupid","dumb","loser","idiot","useless"}; // mean user keywords
		String[] userGoodbyes = {"bye","goodbye","good night","gn","talk to you later","take care","cya"}; // goodbye keywords to terminate the code
		String[] userSubject = {"i'm","i am","myself","im"}; // when user refers to themselves
		String[] chatbotSubject = {"you","you are","you're","ur","u"}; // when user refers to the chatbot
		
		// user questions
		String[] ageQuestion = {"old","born","age","birthday"}; // age keywords
		String[] wellbeingQuestion = {"doing","feeling","are"}; // well-being keywords
		String[] nationalityQuestion = {"from","origin"}; // "nationality" keywords
		
		// question keywords
		String time = "when";
		String location = "where";
		String explanation = "how";
		
		System.out.print("Hi " + name + "! "); // prints the user's name in the greeting
		System.out.println(greetings[(int)(Math.random()*greetings.length)]); // uses Math.random() to pick one of the three greetings in the greetings array
		
		boolean running = true; // initializes a boolean variable with the value true
		while (running) { // runs the following code over and over again while "running" is true
			String userReply = sk.nextLine().toLowerCase(); // gets user input again and turns it to all lowercase so nothing is case sensitive
			if (userReply.contains("?keywords")) { // ?keywords command to prompt the system to print all the keywords
				System.out.print("Nice keywords: "); // prints nice keywords
				for (int i = 0; i < userNice.length - 1; i++) {
					System.out.print(userNice[i] + ", ");
				}
				for (int i = userNice.length-1; i < userNice.length; i++) { // this second for-loop is so that a comma isn't printed at the end of the list of keywords
					System.out.print(userNice[i]);
				}
				
				System.out.println();
				System.out.print("Mean keywords: "); // prints mean keywords
				for (int i = 0; i < userMean.length - 1; i++) {
					System.out.print(userMean[i] + ", ");
				}
				for (int i = userMean.length-1; i < userMean.length; i++) {
					System.out.print(userMean[i]);
				}
				
				System.out.println();
				System.out.print("Goodbye keywords: "); // prints goodbye keywords
				for (int i = 0; i < userGoodbyes.length - 1; i++) {
					System.out.print(userGoodbyes[i] + ", ");
				}
				for (int i = userGoodbyes.length-1; i < userGoodbyes.length; i++) {
					System.out.print(userGoodbyes[i]);
				}
				
				System.out.println();
				System.out.print("User subject keywords: "); // prints user subject keywords
				for (int i = 0; i < userSubject.length - 1; i++) {
					System.out.print(userSubject[i] + ", ");
				}
				for (int i = userSubject.length-1; i < userSubject.length; i++) {
					System.out.print(userSubject[i]);
				}
				
				System.out.println();
				System.out.print("Chatbot subject keywords: "); // prints chatbot subject keywords
				for (int i = 0; i < chatbotSubject.length - 1; i++) {
					System.out.print(chatbotSubject[i] + ", ");
				}
				for (int i = chatbotSubject.length-1; i < chatbotSubject.length; i++) {
					System.out.print(chatbotSubject[i]);
				}
				
				System.out.println();
				System.out.print("Age question keywords: "); // prints age keywords
				for (int i = 0; i < ageQuestion.length-1; i++) {
					System.out.print(ageQuestion[i] + ", ");
				}
				for (int i = ageQuestion.length-1; i < ageQuestion.length; i++) {
					System.out.print(ageQuestion[i]);
				}
				
				System.out.println();
				System.out.print("Well-being question keywords: "); // prints age keywords
				for (int i = 0; i < wellbeingQuestion.length-1; i++) {
					System.out.print(wellbeingQuestion[i] + ", ");
				}
				for (int i = wellbeingQuestion.length-1; i < wellbeingQuestion.length; i++) {
					System.out.print(wellbeingQuestion[i]);
				}
				
				System.out.println();
				System.out.print("Nationality question keywords: "); // prints age keywords
				for (int i = 0; i < nationalityQuestion.length-1; i++) {
					System.out.print(nationalityQuestion[i] + ", ");
				}
				for (int i = nationalityQuestion.length-1; i < nationalityQuestion.length; i++) {
					System.out.print(nationalityQuestion[i]);
				}
				
				System.out.println();
				System.out.print("Question keywords: " + time + ", " + location + ", " + explanation);
				System.out.println();
			}
			
			else if (detectKeyword(userReply, userNice) == true) { // detects when user enters something nice
				if (detectKeyword(userReply, chatbotSubject)) { // detects if the user mentions the chatbot
					System.out.println(niceUserToChatbot[(int)(Math.random()*niceUserToChatbot.length)]); // prints a random niceUserToChatbot reply when the user is nice to the chatbot
				}
				else if (detectKeyword(userReply, chatbotSubject) == false || detectKeyword(userReply, userSubject) == false) { // detects if the user doesn't mention the chatbot nor themselves
					System.out.println(chatbotNice[(int)(Math.random()*chatbotNice.length)]); // generic reply to the user being nice
				}
			}
			
			else if (detectKeyword(userReply, userMean) == true) { // detects when the user enters something mean
				if (detectKeyword(userReply, chatbotSubject)) { 
					System.out.println(meanUserToChatbot[(int)(Math.random()*meanUserToChatbot.length)]); // prints a random meanUserToChatbot reply when the user is mean to the chatbot
				}
				else if (detectKeyword(userReply, userSubject)) { // detects if the user mentions themselves
					System.out.println(meanUserToUser[(int)(Math.random()*meanUserToUser.length)]); // prints a random meanUserToUser reply when the user is mean to themselves
				}
				else {
					System.out.println(chatbotMean[(int)(Math.random()*chatbotMean.length)]); // generic reply to the user being mean
				}
			}
			
			else if (detectKeyword(userReply, userGoodbyes) == true) { // terminate code if user input contains a goodbye keyword
				System.out.println("Are you sure you want to go (enter Y for yes or N for no)? I'll be lonely :("); // prompts user to confirm goodbye
			    running = sk.nextLine().trim().equalsIgnoreCase("n"); // if "n" is entered the code will continue, if "y" is entered the code ends
			    if (running) {
			    	System.out.println("Glad you decided to stay!"); // prints if the user enters "n" and decides to continue the conversation
			    }
			    else {
			    	System.out.println("Goodbye " + name + "! It was a pleasure talking with you."); // prints if the user enters "y" and decides to stop the conversation
			    }
			}
			else if (detectKeyword(userReply, chatbotSubject) == true) { // detects if the user mentions the chatbot
				if (detectKeyword(userReply, ageQuestion) == true && userReply.contains(time) || detectKeyword(userReply, ageQuestion) == true && userReply.contains(explanation)) { // detects ageQuestion keywords and question keywords
					System.out.println(age[(int)(Math.random()*age.length)]); // prints a random age response
				}
				else if (detectKeyword(userReply, wellbeingQuestion) == true && userReply.contains(explanation)) { // detects wellbeingQuestion keywords and question keywords
					System.out.println(wellbeing[(int)(Math.random()*wellbeing.length)]); // prints a random well-being response
				}
				else if (detectKeyword(userReply, nationalityQuestion) == true && (userReply.contains(location))) { // detects nationalityQuestion keywords and question keywords
					System.out.println(nationality[(int)(Math.random()*nationality.length)]); // prints a random nationality response
				}
			}
			else {
				System.out.println("Sorry, I don't understand!" + "\n" + "Please enter a reply that contains one of the keywords from the list of keywords." + "\n" + "Use the command \"?keywords\" to see the list of all the available keywords."); // if userReply doesn't contain a keyword, the chatbot will prompt the user to enter a response that contains a keyword and also tells the user about the ?keywords command
			}
		}
		sk.close();
	}
	public static boolean detectKeyword(String str, String[] arr) { // method to detect a keyword in a string
	    for(int i=0; i < arr.length; i++) { // iterates through every number that corresponds with an element in an array
	        if(str.contains(arr[i])) { // uses .contains() to detect if the string contains a keyword
	            return true; // returns true if a keyword is detected in the string
	        }
	    }
	    return false; // returns false if no keyword is detected in the string
	}
}