import java.util.Scanner;

public class CompleteChatBot {
    public static void main(String[] args) {
        ChatBot bot = new ChatBot();
        bot.start();
    }
}

class ChatBot {
    private String name;
    private Scanner scanner;

    public ChatBot() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Hello! I'm your complete chatbot. What's your name?");
        name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "! How can I assist you today?");
        chatLoop();
    }

    private void chatLoop() {
        while (true) {
            String userInput = scanner.nextLine();
            String response = generateResponse(userInput);
            System.out.println(response);
            if (userInput.equalsIgnoreCase("bye")) {
                break;
            }
        }
        System.out.println("Goodbye, " + name + "! Have a great day!");
        scanner.close();
    }

    private String generateResponse(String input) {
        input = input.toLowerCase();

        if (input.contains("hello") || input.contains("hi")) {
            return "Hello there!";
        } else if (input.contains("how are you")) {
            return "I'm just a chatbot, so I don't have feelings, but thanks for asking!";
        } else if (input.contains("weather")) {
            return "I'm sorry, I can't provide weather updates at the moment.";
        } else if (input.contains("joke")) {
            return "Why don't scientists trust atoms? Because they make up everything!";
        } else if (input.contains("name")) {
            return "My name is ChatBot. What's yours?";
        } else if (input.contains("your age")) {
            return "I don't have an age. I'm forever young!";
        } else if (input.contains("how old am I")) {
            return "I'm sorry, I don't have that information.";
        } else if (input.contains("thank you") || input.contains("thanks")) {
            return "You're welcome!";
        } else {
            return getRandomResponse();
        }
    }

    private String getRandomResponse() {
        String[] responses = {
                "I'm sorry, I didn't understand that. Can you please rephrase?",
                "Hmm, interesting! Tell me more.",
                "That's fascinating!",
                "I'm still learning. Could you explain further?",
                "I'm not sure what you mean by that.",
                "Let's change the topic. Did you know that...",
        };
        int randomIndex = (int) (Math.random() * responses.length);
        return responses[randomIndex];
    }
}
