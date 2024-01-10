package com.example.newourchrive.listOfQuestions

import com.example.newourchrive.screens.quiz.question.Question
// ComSci List Questions
val questionsDAA = listOf(
    Question(
        1,
        "What is the time complexity of an algorithm that iterates through a list of n elements and performs a constant-time operation on each element?",
        listOf("O(1)", "O(n)", "O(log n)", "O(n^2)"),
        "O(n)"
    ),

    Question(
        2,
        "Which sorting algorithm has the worst-case time complexity of O(n log n) and is often used for large datasets?",
        listOf("Bubble Sort", "Insertion Sort", "Merge Sort", "Quick Sort"),
        "Merge Sort"
    ),

    Question(
        3,
        "In dynamic programming, what is the key idea behind memoization?",
        listOf(
            "Storing computed results to avoid redundant computations",
            "Sorting the input data for faster access",
            "Using dynamic memory allocation",
            "Applying recursion in the algorithm for faster execution"
        ),
        "Storing computed results to avoid redundant computations"
    ),

    Question(
        4,
        "What is the purpose of the Big-O notation in algorithm analysis?",
        listOf(
            "Describing the lower bounds of an algorithm",
            "Providing an exact execution time of an algorithm",
            "Analyzing the best-case scenario of an algorithm",
            "Describing the upper bounds of an algorithm"
        ),
        "Describing the upper bounds of an algorithm"
    ),

    Question(
        5,
        "Which data structure is commonly used for implementing priority queues?",
        listOf("Stack", "Queue", "Linked List", "Heap"),
        "Heap"
    ),

    Question(
        6,
        "What is the primary advantage of using dynamic programming in algorithm design?",
        listOf(
            "Efficiently solving problems by breaking them into subproblems",
            "Minimizing the use of recursion",
            "Avoiding the need for loops",
            "Achieving constant time complexity"
        ),
        "Efficiently solving problems by breaking them into subproblems"
    ),

    Question(
        7,
        "Which algorithm is commonly used for finding the shortest path in a weighted graph?",
        listOf("Breadth-First Search", "Dijkstra's Algorithm", "Depth-First Search", "Bellman-Ford Algorithm"),
        "Dijkstra's Algorithm"
    ),

    Question(
        8,
        "What is the primary purpose of the Divide and Conquer strategy in algorithm design?",
        listOf(
            "Minimizing the use of recursion",
            "Solving problems by dividing them into subproblems and solving each subproblem independently",
            "Avoiding the need for loops",
            "Achieving constant time complexity"
        ),
        "Solving problems by dividing them into subproblems and solving each subproblem independently"
    ),

    Question(
        9,
        "Which of the following is not a searching algorithm?",
        listOf("Binary Search", "Linear Search", "Merge Sort", "Interpolation Search"),
        "Merge Sort"
    ),

    Question(
        10,
        "What is the purpose of the 'pivot' in the Quick Sort algorithm?",
        listOf(
            "Identifying the smallest element in the array",
            "Determining the number of elements in the array",
            "Dividing the array into two partitions for sorting",
            "Calculating the average time complexity"
        ),
        "Dividing the array into two partitions for sorting"
    )
)
val questionsCySec = listOf(
    Question(
        1,
        "What is the primary purpose of a firewall in a network security context?",
        listOf("Detecting and removing viruses", "Preventing unauthorized access", "Encrypting data transmission", "Monitoring network performance"),
        "Preventing unauthorized access"
    ),

    Question(
        2,
        "Which of the following is a common method for authenticating users in a system?",
        listOf("Biometric recognition", "Public key encryption", "Ping request", "Network segmentation"),
        "Biometric recognition"
    ),

    Question(
        3,
        "What is the purpose of penetration testing in cybersecurity?",
        listOf("Developing secure software", "Identifying vulnerabilities in a system", "Encrypting data at rest", "Establishing network connections"),
        "Identifying vulnerabilities in a system"
    ),

    Question(
        4,
        "What does the term 'phishing' refer to in the context of cybersecurity?",
        listOf("Gaining unauthorized access to a system", "Manipulating hardware components", "Distributing malicious software", "Deceptive attempts to obtain sensitive information"),
        "Deceptive attempts to obtain sensitive information"
    ),

    Question(
        5,
        "Which cryptographic technique involves using a pair of keys for secure communication?",
        listOf("Symmetric encryption", "Asymmetric encryption", "Hashing", "Salting"),
        "Asymmetric encryption"
    ),

    Question(
        6,
        "What is the purpose of a Virtual Private Network (VPN) in cybersecurity?",
        listOf("Protecting against malware", "Securing network communication over the internet", "Implementing intrusion detection", "Controlling physical access to a network"),
        "Securing network communication over the internet"
    ),

    Question(
        7,
        "What is the term for a malicious software that spreads from one computer to another without the user's knowledge?",
        listOf("Spyware", "Worm", "Trojan horse", "Ransomware"),
        "Worm"
    ),

    Question(
        8,
        "What is the primary goal of an Intrusion Detection System (IDS) in cybersecurity?",
        listOf("Encrypting sensitive data", "Preventing unauthorized access", "Detecting and responding to security threats", "Filtering network traffic"),
        "Detecting and responding to security threats"
    ),

    Question(
        9,
        "What does the term 'Two-Factor Authentication' (2Frefer to in cybersecurity?",
        listOf("Using two different firewalls", "Authenticating users with two different methods", "Encrypting data in two steps", "Running two antivirus programs simultaneously"),
        "Authenticating users with two different methods"
    ),

    Question(
        10,
        "What is the primary purpose of a Security Information and Event Management (SIEM) system?",
        listOf("Encrypting communication channels", "Monitoring and analyzing security events", "Developing secure software applications", "Controlling access to physical facilities"),
        "Monitoring and analyzing security events"
    )
)
// Robotics List Questions
val questionsAI = listOf(
    Question(
        1,
        "What is the primary goal of machine learning?",
        listOf("Mimicking human behavior", "Making decisions based on rules", "Learning patterns from data", "Simulating natural language understanding"),
        "Learning patterns from data"
    ),

    Question(
        2,
        "Which type of machine learning algorithm is used for making predictions based on labeled training data?",
        listOf("Supervised Learning", "Unsupervised Learning", "Reinforcement Learning", "Semi-Supervised Learning"),
        "Supervised Learning"
    ),

    Question(
        3,
        "What does the term 'neural network' refer to in the context of artificial intelligence?",
        listOf("An advanced computer processor", "A type of machine learning algorithm", "Simulating the human brain's interconnected neurons", "A complex rule-based system"),
        "Simulating the human brain's interconnected neurons"
    ),

    Question(
        4,
        "What is the purpose of natural language processing (NLP) in AI?",
        listOf("Generating realistic images", "Understanding and interpreting human language", "Optimizing search engine algorithms", "Analyzing financial data"),
        "Understanding and interpreting human language"
    ),

    Question(
        5,
        "Which AI technique involves training a model to make decisions by rewarding or punishing it based on its actions?",
        listOf("Supervised Learning", "Unsupervised Learning", "Reinforcement Learning", "Genetic Algorithms"),
        "Reinforcement Learning"
    ),

    Question(
        6,
        "What is the purpose of computer vision in artificial intelligence?",
        listOf("Understanding and interpreting human language", "Simulating the human brain's interconnected neurons", "Processing and analyzing visual information", "Generating creative content"),
        "Processing and analyzing visual information"
    ),

    Question(
        7,
        "Which of the following is a key challenge in the development of ethical AI?",
        listOf("Reducing computational complexity", "Ensuring unbiased decision-making", "Improving algorithm efficiency", "Enhancing data storage capabilities"),
        "Ensuring unbiased decision-making"
    ),

    Question(
        8,
        "What does the term 'overfitting' mean in the context of machine learning?",
        listOf("Training a model too much on the training data", "Insufficiently training a model", "Selecting features for a model", "Testing a model on new data"),
        "Training a model too much on the training data"
    ),

    Question(
        9,
        "What is the role of a 'chatbot' in AI applications?",
        listOf("Generating realistic images", "Simulating the human brain's interconnected neurons", "Conducting conversations with users", "Analyzing financial data"),
        "Conducting conversations with users"
    ),

    Question(
        10,
        "Which of the following is an example of unsupervised learning?",
        listOf("Image classification", "Sentiment analysis", "Clustering similar data points", "Predicting stock prices"),
        "Clustering similar data points"
    )
)
val questionsArduino = listOf(
    Question(
        1,
        "What is Arduino?",
        listOf("A programming language", "A microcontroller platform", "A type of sensor", "A computer operating system"),
        "A microcontroller platform"
    ),

    Question(
        2,
        "Which programming language is commonly used for Arduino programming?",
        listOf("Python", "Java", "C++", "JavaScript"),
        "C++"
    ),

    Question(
        3,
        "What is the purpose of the setup() function in Arduino sketches?",
        listOf("Initializing variables", "Executing the main program logic", "Configuring the Arduino board", "Handling user input"),
        "Configuring the Arduino board"
    ),

    Question(
        4,
        "Which Arduino board is commonly used for beginners and educational purposes?",
        listOf("Arduino Uno", "Arduino Mega", "Arduino Nano", "Arduino Due"),
        "Arduino Uno"
    ),

    Question(
        5,
        "What is the role of the loop() function in an Arduino sketch?",
        listOf("Handling user input", "Initializing variables", "Executing the main program logic", "Configuring the Arduino board"),
        "Executing the main program logic"
    ),

    Question(
        6,
        "Which term is used to describe a digital pin set to HIGH in Arduino?",
        listOf("On", "Active", "Low", "Inactive"),
        "On"
    ),

    Question(
        7,
        "What does PWM stand for in the context of Arduino?",
        listOf("Pulse Width Modulation", "Power Wiring Mechanism", "Parallel Wire Management", "Programmable Wireless Module"),
        "Pulse Width Modulation"
    ),

    Question(
        8,
        "Which Arduino function is used to read data from an analog pin?",
        listOf("digitalRead()", "analogRead()", "digitalWrite()", "analogWrite()"),
        "analogRead()"
    ),

    Question(
        9,
        "What is the purpose of a resistor in an Arduino circuit?",
        listOf("To amplify signals", "To regulate voltage", "To provide a ground connection", "To limit current flow"),
        "To limit current flow"
    ),

    Question(
        10,
        "What is the purpose of the delay() function in Arduino programming?",
        listOf("Creating random delays", "Pausing program execution", "Simulating user input", "Generating random numbers"),
        "Pausing program execution"
    )
)
