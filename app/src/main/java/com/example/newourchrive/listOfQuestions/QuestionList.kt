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
val questionsProg = listOf(
    Question(1, "What is the purpose of a variable in programming?", listOf("Store and manipulate data", "Display information on the screen", "Connect to the internet", "Create graphics"), "Store and manipulate data"),
    Question(2, "Which data type is used to store whole numbers in programming?", listOf("Float", "String", "Integer", "Boolean"), "Integer"),
    Question(3, "What is the role of a loop in programming?", listOf("Define a function", "Execute a block of code repeatedly", "Handle errors", "Create a user interface"), "Execute a block of code repeatedly"),
    Question(4, "Which programming language is known for its simplicity and readability?", listOf("Java", "Python", "C++", "Ruby"), "Python"),
    Question(5, "What is the purpose of the \"if\" statement in programming?", listOf("Repeat a block of code", "Define a function", "Make decisions based on conditions", "Connect to a database"), "Make decisions based on conditions"),
    Question(6, "What does the acronym \"OOP\" stand for in programming?", listOf("Object-Oriented Programming", "Output-Overhead Protocol", "Operator-Operand Procedure", "Overlapping Object Process"), "Object-Oriented Programming"),
    Question(7, "Which of the following is not a programming paradigm?", listOf("Procedural", "Functional", "Logical", "Electrical"), "Electrical"),
    Question(8, "In programming, what does the term \"API\" stand for?", listOf("Application Programming Interface", "Advanced Programming Instruction", "Automated Program Integration", "Application Process Interface"), "Application Programming Interface"),
    Question(9, "What is the purpose of version control systems like Git?", listOf("Manage and track changes in code", "Execute code", "Debug programs", "Create user interfaces"), "Manage and track changes in code"),
    Question(10, "Which of the following is a benefit of modular programming?", listOf("Increased code complexity", "Easier debugging and maintenance", "Limited code reuse", "Slower program execution"), "Easier debugging and maintenance")

)
val questionsDSA = listOf(
    Question(11, "What is the time complexity of an algorithm that has a constant runtime?", listOf("O(1)", "O(log n)", "O(n)", "O(n^2)"), "O(1)"),
    Question(12, "What data structure follows the Last In, First Out (LIFO) principle?", listOf("Queue", "Stack", "Linked List", "Tree"), "Stack"),
    Question(13, "Which sorting algorithm has the best average-case time complexity?", listOf("Bubble Sort", "Insertion Sort", "Quick Sort", "Selection Sort"), "Quick Sort"),
    Question(14, "What is the purpose of a hash table in data structures?", listOf("Sorting elements", "Storing key-value pairs with fast retrieval", "Representing hierarchical relationships", "Creating dynamic arrays"), "Storing key-value pairs with fast retrieval"),
    Question(15, "What is the main advantage of a binary search over a linear search?", listOf("Binary search is faster for large datasets", "Binary search requires less memory", "Linear search is more accurate", "Linear search is always faster"), "Binary search is faster for large datasets"),
    Question(16, "Which of the following is a dynamic programming paradigm?", listOf("Breadth-First Search (BFS)", "Greedy Algorithm", "Divide and Conquer", "Memoization"), "Memoization"),
    Question(17, "What is the role of a queue in data structures?", listOf("Store elements in a sorted order", "Implement recursion", "Follow the Last In, First Out (LIFO) principle", "Manage elements in a First In, First Out (FIFO) order"), "Manage elements in a First In, First Out (FIFO) order"),
    Question(18, "In a binary tree, what is the maximum number of nodes at level 3?", listOf("2", "4", "8", "16"), "8"),
    Question(19, "Which data structure is best suited for implementing a cache?", listOf("Stack", "Queue", "Linked List", "Hash Table"), "Hash Table"),
    Question(20, "What is the purpose of the \"Big-O\" notation in algorithm analysis?", listOf("Represent the best-case scenario", "Indicate the worst-case time complexity", "Describe the average-case performance", "Measure memory consumption"), "Indicate the worst-case time complexity")
)
val questionsWebDev = listOf(
    Question(21, "Which programming language is commonly used for server-side web development?", listOf("JavaScript", "HTML", "Python", "PHP"), "Python"),
    Question(22, "What does CSS stand for in the context of web development?", listOf("Computer Style Sheets", "Creative Style Selector", "Cascading Style Sheets", "Colorful Styling System"), "Cascading Style Sheets"),
    Question(23, "What is the purpose of the HTML <div> element?", listOf("Embed multimedia content", "Define a hyperlink", "Group and structure content", "Create a form"), "Group and structure content"),
    Question(24, "Which HTTP status code indicates a successful request in web development?", listOf("200 OK", "404 Not Found", "500 Internal Server Error", "302 Found"), "200 OK"),
    Question(25, "What is the role of AJAX in web development?", listOf("Asynchronous JavaScript and XML", "Advanced JavaScript and XML", "Automated JavaScript and XHTML", "Asynchronous JSON and XHTML"), "Asynchronous JavaScript and XML"),
    Question(26, "What is the purpose of a responsive web design?", listOf("Make web pages load faster", "Ensure compatibility with Internet Explorer", "Create visually appealing websites", "Optimize the layout for different devices and screen sizes"), "Optimize the layout for different devices and screen sizes"),
    Question(27, "In web development, what does the term \"API endpoint\" refer to?", listOf("A specific location in the code", "A function that handles user input", "A URL where an API can be accessed", "An error in the code"), "A URL where an API can be accessed"),
    Question(28, "What is the purpose of the \"box model\" in CSS?", listOf("Control the layout of a webpage", "Define color schemes", "Handle user interactions", "Manage server-side logic"), "Control the layout of a webpage"),
    Question(29, "Which database is commonly used in conjunction with web development?", listOf("SQLite", "MongoDB", "Redis", "Oracle"), "MongoDB"),
    Question(30, "What is the purpose of the \"favicon\" in web development?", listOf("Enhance website security", "Provide a visual representation of the website", "Improve search engine optimization (SEO)", "Monitor user interactions"), "Provide a visual representation of the website")
)
val questionNetAndSec = listOf(
    Question(31, "What is the primary function of the DNS in networking?", listOf("Encrypt data transmission", "Resolve domain names to IP addresses", "Authenticate users", "Manage network protocols"), "Resolve domain names to IP addresses"),

    Question(32, "Which protocol is commonly used for secure communication over the internet?", listOf("FTP", "HTTPS", "SMTP", "SNMP"), "HTTPS"),

    Question(33, "What is a \"firewall\" in the context of network security?", listOf("A physical barrier in a data center", "A software or hardware system that filters network traffic", "A protocol for secure file transfer", "A device for connecting different networks"), "A software or hardware system that filters network traffic"),

    Question(34, "What is the purpose of a VPN (Virtual Private Network) in networking?", listOf("Enhance website performance", "Encrypt and secure communication over the internet", "Manage domain names", "Provide dynamic IP addresses"), "Encrypt and secure communication over the internet"),

    Question(35, "What does the term \"phishing\" refer to in the context of cybersecurity?", listOf("Unauthorized access to computer systems", "Malicious software that encrypts files", "Deceptive attempts to obtain sensitive information", "Network-based attacks on servers"), "Deceptive attempts to obtain sensitive information"),

    Question(36, "Which encryption algorithm is commonly used for securing wireless networks?", listOf("DES", "AES", "RSA", "MD5"), "AES"),

    Question(37, "What is the purpose of an SSL/TLS certificate?", listOf("Authenticate users", "Encrypt data during transmission", "Manage network traffic", "Prevent malware infections"), "Encrypt data during transmission"),

    Question(38, "What is a \"DDoS attack\" in the context of network security?", listOf("Data Distribution and Optimization Service", "Dynamic Domain of System Security", "Distributed Denial of Service", "Digital Defense Operating System"), "Distributed Denial of Service"),

    Question(39, "What is the role of an Intrusion Detection System (IDS) in cybersecurity?", listOf("Prevent unauthorized access", "Detect and respond to potential security threats", "Encrypt sensitive data", "Manage network protocols"), "Detect and respond to potential security threats"),

    Question(40, "What is the purpose of multi-factor authentication in cybersecurity?", listOf("Simplify the login process", "Use multiple firewalls", "Enhance user privacy", "Increase account security by requiring multiple forms of verification"), "Increase account security by requiring multiple forms of verification")
)
val questionsDBMS = listOf(
    Question(41, "What is the purpose of a primary key in a database table?", listOf("Store large amounts of data", "Ensure each record has a unique identifier", "Define the data type of a column", "Establish foreign key relationships"), "Ensure each record has a unique identifier"),

    Question(42, "Which type of database model organizes data in tables with rows and columns?", listOf("Hierarchical", "Network", "Relational", "Object-Oriented"), "Relational"),

    Question(43, "What does the acronym SQL stand for in database management?", listOf("Structured Query Language", "Simple Question Language", "System Query Logic", "Sequential Question Language"), "Structured Query Language"),

    Question(44, "In a relational database, what is the purpose of the \"JOIN\" operation?", listOf("Combine rows from different tables based on a related column", "Delete data from a table", "Sort data in ascending order", "Create a new table"), "Combine rows from different tables based on a related column"),

    Question(45, "What is the role of an index in a database?", listOf("Manage user permissions", "Speed up data retrieval operations", "Control data encryption", "Define table relationships"), "Speed up data retrieval operations"),

    Question(46, "Which type of database management system is known for its scalability and flexibility?", listOf("Relational DBMS", "NoSQL DBMS", "Hierarchical DBMS", "Network DBMS"), "NoSQL DBMS"),

    Question(47, "What is the purpose of a stored procedure in database management?", listOf("Define the structure of a table", "Store and execute a set of SQL statements", "Control data access permissions", "Manage database transactions"), "Store and execute a set of SQL statements"),

    Question(48, "In database terminology, what does \"ACID\" stand for?", listOf("Atomicity, Consistency, Isolation, Durability", "Association, Control, Isolation, Deployment", "Access, Condition, Integration, Deployment", "Atomicity, Control, Integration, Deployment"), "Atomicity, Consistency, Isolation, Durability"),

    Question(49, "What is the purpose of database normalization?", listOf("Optimize data storage for performance", "Simplify data retrieval operations", "Ensure data consistency and eliminate redundancy", "Encrypt sensitive data"), "Ensure data consistency and eliminate redundancy"),

    Question(50, "In a database table, what is a foreign key?", listOf("A key used for encryption", "A unique identifier for each record", "A column that establishes a link with another table", "A primary key with a numeric data type"), "A column that establishes a link with another table")
)
val questionsML = listOf(
    Question(51, "What is the main goal of supervised learning in machine learning?", listOf("Uncover hidden patterns in data", "Train a model using labeled input-output pairs", "Simulate human-like decision-making", "Enhance data security"), "Train a model using labeled input-output pairs"),

    Question(52, "What does the term \"overfitting\" mean in the context of machine learning?", listOf("The model performs well on new, unseen data", "The model fits the training data too closely, resulting in poor generalization", "The model is too simple to capture complex patterns", "The model is biased towards certain types of data"), "The model fits the training data too closely, resulting in poor generalization"),

    Question(53, "Which algorithm is commonly used for clustering in machine learning?", listOf("Linear Regression", "Decision Trees", "K-Means", "Support Vector Machines"), "K-Means"),

    Question(54, "What is the purpose of the activation function in a neural network?", listOf("Normalize input data", "Determine the output of a neuron", "Store and retrieve weights", "Define the learning rate"), "Determine the output of a neuron"),

    Question(55, "What does the term \"feature extraction\" mean in machine learning?", listOf("Identify and select relevant information from the data", "Transform input data into a higher-dimensional space", "Evaluate the performance of a model", "Train a model using labeled data"), "Identify and select relevant information from the data"),

    Question(56, "In reinforcement learning, what is the role of an \"agent\"?", listOf("Evaluate model performance", "Make decisions and take actions in an environment", "Define the architecture of a neural network", "Generate synthetic training data"), "Make decisions and take actions in an environment"),

    Question(57, "What is the purpose of cross-validation in machine learning?", listOf("Evaluate a model's performance on new, unseen data", "Select the best features for training", "Increase the size of the training dataset", "Train multiple models simultaneously"), "Evaluate a model's performance on new, unseen data"),

    Question(58, "Which type of machine learning algorithm is based on mimicking the behavior of the brain?", listOf("Reinforcement Learning", "Unsupervised Learning", "Neural Networks", "Decision Trees"), "Neural Networks"),

    Question(59, "What is the difference between precision and recall in machine learning evaluation?", listOf("Precision measures the ability to avoid false positives, while recall measures the ability to avoid false negatives.", "Precision measures the ability to avoid false negatives, while recall measures the ability to avoid false positives.", "Precision is the same as recall.", "Precision and recall are not relevant in machine learning evaluation."), "Precision measures the ability to avoid false positives, while recall measures the ability to avoid false negatives."),

    Question(60, "What is the purpose of dimensionality reduction in machine learning?", listOf("Increase the complexity of a model", "Simplify the dataset by reducing the number of features", "Enhance the interpretability of a model", "Speed up the training process"), "Simplify the dataset by reducing the number of features")
)
val questionsSoftEng = listOf(
    Question(61, "What is the purpose of a software requirements specification document in software engineering?", listOf("Document the design decisions of the development team", "Define the functionality and constraints of the software", "Record the project timeline", "Communicate with end-users"), "Define the functionality and constraints of the software"),

    Question(62, "What does the term \"agile development\" refer to in software engineering?", listOf("A flexible and iterative approach to software development", "A strict and sequential development process", "A focus on hardware rather than software", "An emphasis on documentation over code"), "A flexible and iterative approach to software development"),

    Question(63, "What is the purpose of version control in software development?", listOf("Manage and track changes in code", "Generate automated test cases", "Debug programs", "Design user interfaces"), "Manage and track changes in code"),

    Question(64, "What does the acronym \"SDLC\" stand for in software engineering?", listOf("Software Development Life Cycle", "System Design and Logic Compilation", "Source Code Documentation and Licensing", "Software Debugging and Logic Correction"), "Software Development Life Cycle"),

    Question(65, "What is the primary goal of software testing in the development process?", listOf("Write efficient code", "Identify and fix bugs or defects", "Optimize database performance", "Document the software architecture"), "Identify and fix bugs or defects"),

    Question(66, "What is the purpose of a use case diagram in software engineering?", listOf("Represent the flow of data in a system", "Illustrate the interactions between different software components", "Describe the functionality of the software from an end-user perspective", "Model the relationships between classes in object-oriented programming"), "Describe the functionality of the software from an end-user perspective"),

    Question(67, "What is the role of a project manager in software development?", listOf("Write code for the project", "Ensure the project stays within budget and on schedule", "Design the user interface", "Debug and test the software"), "Ensure the project stays within budget and on schedule"),

    Question(68, "What is the purpose of a \"use case\" in software engineering?", listOf("Identify potential security vulnerabilities", "Define specific scenarios in which the software will be used", "Manage version control", "Optimize algorithm performance"), "Define specific scenarios in which the software will be used"),

    Question(69, "In the context of software engineering, what does the term \"refactoring\" mean?", listOf("Rewriting the entire codebase", "Making improvements to the existing code without changing its external behavior", "Creating automated tests", "Identifying and fixing bugs in the software"), "Making improvements to the existing code without changing its external behavior"),

    Question(70, "What is the purpose of a Gantt chart in project management?", listOf("Track the progress of the development team", "Illustrate the flow of data in a system", "Visualize the project timeline and dependencies", "Design the user interface of the software"), "Visualize the project timeline and dependencies")
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
val questionsRoboticsFund = listOf(
    Question(1, "What is the primary purpose of a sensor in robotics?", listOf("Provide power to the robot", "Detect and measure environmental conditions", "Control the robot's movement", "Establish wireless communication"), "Detect and measure environmental conditions"),

    Question(2, "In robotics, what does the term \"actuator\" refer to?", listOf("A type of sensor", "A device that converts electrical signals into mechanical movement", "The brain of the robot", "A safety mechanism for robots"), "A device that converts electrical signals into mechanical movement"),

    Question(3, "What is the role of a microcontroller in a robotic system?", listOf("Power distribution", "Execute high-level algorithms", "Control actuators and sensors", "Provide structural support"), "Control actuators and sensors"),

    Question(4, "Which programming language is commonly used for programming robots?", listOf("Java", "Python", "C++", "Ruby"), "Python"),

    Question(5, "What is the purpose of a gripper in a robotic arm?", listOf("Generate power for the robot", "Provide stability to the robot", "Manipulate and grasp objects", "Control the robot's locomotion"), "Manipulate and grasp objects"),

    Question(6, "What is the significance of the term \"degrees of freedom\" in robotics?", listOf("The temperature range in which the robot operates", "The number of sensors in the robot", "The range of motion a robot has in different directions", "The speed at which the robot can perform tasks"), "The range of motion a robot has in different directions"),

    Question(7, "What does the acronym \"PID\" stand for in the context of robotics?", listOf("Proportional, Integral, Derivative", "Power Input Device", "Programming in Robotics", "Precision and Integration Design"), "Proportional, Integral, Derivative"),

    Question(8, "In robotics, what is the purpose of a \"haptic feedback\" system?", listOf("Display visual information to the user", "Provide tactile sensations or force feedback", "Navigate the robot in the environment", "Monitor the robot's power consumption"), "Provide tactile sensations or force feedback"),

    Question(9, "What is the role of a gyroscope in a mobile robot?", listOf("Measure the robot's speed", "Provide positional information", "Stabilize the robot's orientation", "Control the robot's energy efficiency"), "Stabilize the robot's orientation"),

    Question(10, "In robotic programming, what does \"collision detection\" refer to?", listOf("Preventing the robot from colliding with objects", "Detecting when the robot is idle", "Analyzing collisions in a virtual environment", "Measuring the impact force of collisions"), "Preventing the robot from colliding with objects")
)
val questionsCV = listOf(
    Question(11, "What is the main purpose of computer vision in robotics?", listOf("Generate random images for the robot to analyze", "Enable robots to see and interpret the environment", "Improve the robot's processing speed", "Enhance the robot's physical strength"), "Enable robots to see and interpret the environment"),

    Question(12, "What is the difference between 2D and 3D vision in robotics?", listOf("The type of sensors used", "The dimensions of the visual information captured", "The processing speed of the vision system", "The color accuracy in visual perception"), "The dimensions of the visual information captured"),

    Question(13, "What does the term \"object recognition\" mean in the context of robotics?", listOf("Identifying and classifying objects in the environment", "Avoiding collisions with objects", "Measuring the weight of objects", "Creating 3D models of objects"), "Identifying and classifying objects in the environment"),

    Question(14, "How does a LIDAR sensor contribute to a robot's perception?", listOf("Measures light intensity for vision", "Captures detailed color information", "Uses laser beams to detect distances and create maps", "Provides touch feedback to the robot"), "Uses laser beams to detect distances and create maps"),

    Question(15, "In computer vision, what is \"image segmentation\"?", listOf("Dividing an image into distinct regions based on certain criteria", "Blurring the edges of an image", "Increasing the resolution of an image", "Removing noise from an image"), "Dividing an image into distinct regions based on certain criteria"),

    Question(16, "What is the purpose of a depth sensor in robotic perception?", listOf("Measures the distance between the robot and nearby objects", "Provides color information to the robot", "Determines the texture of surfaces", "Generates sound signals for navigation"), "Measures the distance between the robot and nearby objects"),

    Question(17, "How does a neural network contribute to object recognition in robots?", listOf("By directly manipulating physical objects", "By learning and identifying patterns from data", "By controlling the robot's motor functions", "By facilitating wireless communication between robots"), "By learning and identifying patterns from data"),

    Question(18, "What is the significance of the term \"point cloud\" in robotic perception?", listOf("A type of sensor used for 2D vision", "A representation of 3D spatial data using points", "The speed at which a robot processes visual information", "A measure of the robot's power consumption"), "A representation of 3D spatial data using points"),

    Question(19, "What is the role of a thermal camera in robotic perception?", listOf("Captures detailed color information", "Measures the temperature of objects in the environment", "Identifies and classifies objects based on shape", "Enhances the robot's ability to navigate in the dark"), "Measures the temperature of objects in the environment"),

    Question(20, "How does a robot use \"feature extraction\" in computer vision?", listOf("To blur the background in images", "To enhance the brightness of visual information", "To identify and focus on specific visual elements", "To decrease the resolution of captured images"), "To identify and focus on specific visual elements")
)
val questionsControlAndMotionPlan = listOf(
    Question(21, "What is the purpose of a \"kinematic model\" in robotics?", listOf("Generate random motions for the robot", "Simulate the robot's environment", "Represent the relationship between joint motions and the robot's end-effector", "Provide feedback on the robot's power consumption"), "Represent the relationship between joint motions and the robot's end-effector"),

    Question(22, "In robot control, what does the term \"closed-loop control\" mean?", listOf("A control system where the output depends on the current state and previous inputs", "A control system that only operates in predefined motions", "A control system that continuously repeats the same action", "A control system that does not require any feedback"), "A control system where the output depends on the current state and previous inputs"),

    Question(23, "What is the significance of the term \"inverse kinematics\" in robotics?", listOf("A method for optimizing robot speed", "A way to determine the joint angles required for a desired end-effector position", "A technique for capturing the robot's environment", "A type of sensor used for motion planning"), "A way to determine the joint angles required for a desired end-effector position"),

    Question(24, "How does a robot use \"trajectory planning\" in motion control?", listOf("To predict future obstacles in the environment", "To optimize the robot's power consumption", "To plan and generate a path for the robot's end-effector", "To simulate the robot's movements in a virtual environment"), "To plan and generate a path for the robot's end-effector"),

    Question(25, "What is the purpose of a \"motion controller\" in robotics?", listOf("To design the physical structure of the robot", "To control the speed and position of the robot's actuators", "To measure the robot's power consumption", "To analyze the visual information captured by the robot"), "To control the speed and position of the robot's actuators"),

    Question(26, "What does the term \"dynamics\" refer to in the context of robot motion?", listOf("The robot's ability to adapt to changing environments", "The study of forces and torques acting on the robot's components", "The speed at which the robot processes visual information", "The precision of the robot's end-effector movements"), "The study of forces and torques acting on the robot's components"),

    Question(27, "How does a robot use \"force control\" in its motion planning?", listOf("To speed up the robot's movements", "To detect collisions and avoid obstacles", "To measure the robot's energy efficiency", "To control and regulate the forces applied by the robot's end-effector"), "To control and regulate the forces applied by the robot's end-effector"),

    Question(28, "What is the role of a \"collision detection system\" in robot motion planning?", listOf("To identify potential security vulnerabilities", "To analyze the robot's power consumption", "To prevent the robot from colliding with obstacles", "To simulate the robot's movements in a virtual environment"), "To prevent the robot from colliding with obstacles"),

    Question(29, "How does a robot use \"path optimization\" in motion planning?", listOf("To identify and select the most efficient path for the robot", "To control the robot's communication with other devices", "To enhance the robot's visual perception", "To increase the robot's processing speed"), "To identify and select the most efficient path for the robot"),

    Question(30, "What is the significance of the term \"singularity\" in robotic motion control?", listOf("A point in the robot's environment where motion is impossible", "A technique for simulating robot movements", "The robot's ability to adapt to changing environments", "A measure of the robot's energy efficiency"), "A point in the robot's environment where motion is impossible")
)
val questionsLocalizationAndMapping = listOf(
    Question(31, "What is the primary purpose of \"robot localization\" in robotics?", listOf("To identify and classify objects in the environment", "To determine the robot's position and orientation in a known environment", "To simulate the robot's movements in a virtual environment", "To control the speed and position of the robot's actuators"), "To determine the robot's position and orientation in a known environment"),

    Question(32, "What does the term \"odometry\" refer to in the context of robot localization?", listOf("A technique for capturing the robot's environment", "The study of forces and torques acting on the robot's components", "The use of sensors to estimate the robot's position based on wheel movements", "A method for optimizing robot speed"), "The use of sensors to estimate the robot's position based on wheel movements"),

    Question(33, "How does a robot use \"SLAM\" (Simultaneous Localization and Mapping) in its navigation?", listOf("To navigate in the dark", "To optimize the robot's power consumption", "To create a map of the environment while simultaneously determining its location", "To increase the robot's processing speed"), "To create a map of the environment while simultaneously determining its location"),

    Question(34, "What is the role of a \"pose estimation algorithm\" in robot localization?", listOf("To detect and avoid obstacles in the environment", "To estimate the robot's position and orientation", "To measure the temperature of objects in the environment", "To enhance the robot's visual perception"), "To estimate the robot's position and orientation"),

    Question(35, "What is the purpose of a \"localization filter\" in robotics?", listOf("To improve the robot's communication with other devices", "To analyze the robot's power consumption", "To estimate the robot's position by combining sensor measurements with predictions", "To control the robot's movements in a predefined path"), "To estimate the robot's position by combining sensor measurements with predictions"),

    Question(36, "How does a robot use \"landmark-based localization\"?", listOf("By navigating using predefined landmarks in the environment", "By relying solely on odometry data for navigation", "By generating random trajectories", "By simulating movements in a virtual environment"), "By navigating using predefined landmarks in the environment"),

    Question(37, "What is the significance of the term \"Monte Carlo Localization\" (MCL) in robotics?", listOf("A technique for optimizing robot speed", "A method for capturing the robot's environment", "An approach to robot localization that uses random sampling", "The robot's ability to adapt to changing environments"), "An approach to robot localization that uses random sampling"),

    Question(38, "How does a robot use \"visual SLAM\" in its navigation?", listOf("By relying on odometry data from wheel movements", "By creating a map of the environment based on visual information", "By measuring the robot's power consumption", "By enhancing the robot's tactile perception"), "By creating a map of the environment based on visual information"),

    Question(39, "What does the term \"map merging\" mean in the context of robot navigation?", listOf("Combining multiple maps created by different robots", "Creating a map of the environment based on visual information", "Merging different navigation algorithms", "A method for simulating robot movements"), "Combining multiple maps created by different robots"),

    Question(40, "How does a robot use \"loop closure\" in its navigation system?", listOf("By closing physical loops in the robot's structure", "By optimizing the robot's power consumption", "By detecting and correcting errors in the map to improve accuracy", "By controlling the robot's movements in a predefined path"), "By detecting and correcting errors in the map to improve accuracy")
)
val questionsHRI = listOf(
    Question(41, "What is the primary goal of human-robot interaction?", listOf("To enhance the robot's processing speed", "To develop new programming languages for robots", "To enable communication and collaboration between humans and robots", "To control the robot's power consumption"), "To enable communication and collaboration between humans and robots"),

    Question(42, "How does a robot use \"speech recognition\" in human-robot interaction?", listOf("To measure the robot's energy efficiency", "To enhance the robot's visual perception", "To interpret and understand spoken language", "To generate random speech patterns"), "To interpret and understand spoken language"),

    Question(43, "What is the purpose of a \"haptic interface\" in human-robot interaction?", listOf("To display visual information to the user", "To provide tactile feedback or sensations", "To control the robot's movements", "To optimize the robot's power consumption"), "To provide tactile feedback or sensations"),

    Question(44, "How does a robot use \"gesture recognition\" in its interaction with humans?", listOf("To navigate the robot in the environment", "To measure the robot's power consumption", "To interpret and respond to human gestures", "To generate random gestures"), "To interpret and respond to human gestures"),

    Question(45, "What is the role of \"emotion recognition\" in human-robot interaction?", listOf("To simulate human emotions in robots", "To avoid collisions with humans", "To measure the robot's energy efficiency", "To enhance the robot's visual perception"), "To simulate human emotions in robots"),

    Question(46, "How does a robot use \"collaborative robotics\" in its interaction with humans?", listOf("To compete with humans in tasks", "To simulate the robot's movements in a virtual environment", "To enable robots to work alongside humans in shared tasks", "To control the robot's communication with other devices"), "To enable robots to work alongside humans in shared tasks"),

    Question(47, "What does the term \"teleoperation\" mean in the context of human-robot interaction?", listOf("A method for simulating robot movements", "The remote control of a robot by a human operator", "A technique for capturing the robot's environment", "The robot's ability to adapt to changing environments"), "The remote control of a robot by a human operator"),

    Question(48, "What is the significance of the term \"user interface design\" in human-robot interaction?", listOf("To optimize the robot's power consumption", "To design the physical structure of the robot", "To create interfaces for effective communication between humans and robots", "To navigate the robot in the environment"), "To create interfaces for effective communication between humans and robots"),

    Question(49, "How does a robot use \"adaptive learning\" in its interaction with humans?", listOf("To generate random learning patterns", "To enhance the robot's visual perception", "To adapt and improve its behavior based on human interactions", "To measure the robot's energy efficiency"), "To adapt and improve its behavior based on human interactions"),

    Question(50, "What is the purpose of \"human-aware motion planning\" in robotics?", listOf("To detect and avoid obstacles in the environment", "To control the robot's communication with other devices", "To simulate the robot's movements in a virtual environment", "To optimize the robot's power consumption"), "To detect and avoid obstacles in the environment")
)
val questionsRobotApps = listOf(
    Question(51, "What is the primary application of robotics in manufacturing?", listOf("Speech recognition", "Medical diagnostics", "Industrial automation and assembly", "Virtual reality gaming"), "Industrial automation and assembly"),

    Question(52, "How does robotics contribute to the field of healthcare?", listOf("By developing new programming languages for medical devices", "By simulating surgeries in a virtual environment", "By enabling robotic assistance in surgeries", "By controlling the power consumption of medical equipment"), "By enabling robotic assistance in surgeries"),

    Question(53, "What is the role of robotics in space exploration?", listOf("To optimize power consumption on spacecraft", "To compete with human astronauts", "To simulate space environments on Earth", "To perform tasks in space exploration missions"), "To perform tasks in space exploration missions"),

    Question(54, "How does robotics play a role in agriculture?", listOf("By generating random agricultural practices", "By optimizing power consumption in farming equipment", "By enabling autonomous farming operations", "By simulating plant growth in controlled environments"), "By enabling autonomous farming operations"),

    Question(55, "What is the purpose of robotics in search and rescue operations?", listOf("To enhance the visual perception of rescue teams", "To develop new programming languages for search robots", "To compete with human rescue workers", "To navigate robots in a simulated rescue environment"), "To enhance the visual perception of rescue teams"),

    Question(56, "How does robotics contribute to environmental monitoring?", listOf("By generating random environmental data", "By optimizing power consumption in monitoring devices", "By simulating weather patterns in a virtual environment", "By using autonomous robots for data collection"), "By using autonomous robots for data collection"),

    Question(57, "What is the role of robotics in the automotive industry?", listOf("To control the power consumption of vehicles", "To simulate traffic scenarios in a virtual environment", "To compete with human drivers", "To enable automation in manufacturing and testing processes"), "To enable automation in manufacturing and testing processes"),

    Question(58, "How does robotics impact the field of education?", listOf("By developing robotic teachers", "By enhancing visual perception for students", "By enabling interactive and hands-on learning experiences", "By optimizing power consumption in educational technology"), "By enabling interactive and hands-on learning experiences"),

    Question(59, "What is the significance of robotics in entertainment?", listOf("To simulate random entertainment scenarios", "To optimize power consumption in entertainment systems", "To develop new programming languages for video games", "To enhance user experiences through robotics in theme parks and shows"), "To enhance user experiences through robotics in theme parks and shows"),

    Question(60, "How does robotics contribute to the field of research and exploration?", listOf("By generating random research data", "By optimizing power consumption in laboratories", "By enabling autonomous data collection in remote areas", "By simulating experiments in a virtual environment"), "By enabling autonomous data collection in remote areas")
)
val questionsTrends = listOf(
    Question(61, "What is one of the major challenges in robotics regarding power consumption?", listOf("Excessive reliance on renewable energy sources", "Balancing energy efficiency with performance requirements", "Lack of interest in energy-efficient designs", "Random fluctuations in power supply"), "Balancing energy efficiency with performance requirements"),

    Question(62, "How does the aging population contribute to the need for robotics in healthcare?", listOf("By decreasing the demand for medical assistance", "By increasing the number of human healthcare professionals", "By requiring assistance in tasks related to healthcare and daily living", "By reducing the complexity of medical conditions"), "By requiring assistance in tasks related to healthcare and daily living"),

    Question(63, "What is the significance of the term 'human augmentation' in the future of robotics?", listOf("Enhancing human physical and cognitive abilities through technology", "Decreasing human reliance on technology", "Competing with human abilities using robotic enhancements", "Creating a divide between humans and robots"), "Enhancing human physical and cognitive abilities through technology"),

    Question(64, "How does the concept of 'swarm robotics' contribute to future robotic applications?", listOf("By promoting individual robot tasks", "By decreasing collaboration among robots", "By enabling groups of robots to work together in a coordinated manner", "By randomly assigning tasks to robots"), "By enabling groups of robots to work together in a coordinated manner"),

    Question(65, "What is the role of artificial intelligence (AI) in shaping the future of robotics?", listOf("To limit the capabilities of robots", "To compete with human intelligence", "To enhance decision-making and learning abilities of robots", "To generate random patterns of behavior in robots"), "To enhance decision-making and learning abilities of robots"),

    Question(66, "How does the concept of 'soft robotics' impact the future design of robots?", listOf("By promoting rigid and inflexible robot structures", "By optimizing power consumption in robot design", "By incorporating soft and flexible materials for enhanced adaptability", "By competing with traditional rigid robots"), "By incorporating soft and flexible materials for enhanced adaptability"),

    Question(67, "What is one of the challenges associated with autonomous vehicles and robotics in transportation?", listOf("Excessive use of manual control in vehicles", "Lack of interest in reducing traffic congestion", "Ensuring safe and reliable navigation in dynamic environments", "Random fluctuations in fuel prices"), "Ensuring safe and reliable navigation in dynamic environments"),

    Question(68, "How does the integration of robots with the Internet of Things (IoT) impact future applications?", listOf("By isolating robots from connected devices", "By decreasing data exchange between robots and IoT devices", "By enhancing collaboration and communication among interconnected devices", "By randomly disconnecting robots from the IoT"), "By enhancing collaboration and communication among interconnected devices"),

    Question(69, "What is the significance of ethical considerations in the development and deployment of robotics?", listOf("To limit the capabilities of robots", "To promote the use of robots without ethical considerations", "To ensure responsible and safe use of robotic technologies", "To encourage random experimentation in robotics"), "To ensure responsible and safe use of robotic technologies"),

    Question(70, "How does the concept of 'explainable AI' address concerns in robotics and artificial intelligence?", listOf("By avoiding transparency in AI decision-making", "By promoting opaque decision-making processes", "By providing understandable explanations for AI decisions", "By randomly generating decisions without explanations"), "By providing understandable explanations for AI decisions")
)

// Electricity List Questions

val questionsCircuit = listOf(
    Question(1, "What is the fundamental unit of electrical resistance?", listOf("Ohm", "Watt", "Ampere", "Volt"), "Ohm"),

    Question(2, "In a series circuit, how does the total resistance change as more resistors are added?", listOf("Increases", "Decreases", "Remains the same", "Fluctuates randomly"), "Increases"),

    Question(3, "What is the purpose of a diode in an electrical circuit?", listOf("To store electrical energy", "To amplify signals", "To control the flow of current in one direction", "To measure voltage"), "To control the flow of current in one direction"),

    Question(4, "How is electrical power calculated in a DC circuit?", listOf("Voltage multiplied by current", "Current divided by voltage", "Resistance multiplied by current squared", "Voltage divided by resistance"), "Voltage multiplied by current"),

    Question(5, "What does Kirchhoff's Voltage Law state?", listOf("The sum of currents entering a node is equal to the sum of currents leaving the node", "The total resistance in a series circuit is equal to the sum of individual resistances", "The algebraic sum of voltages in any closed loop is equal to zero", "The voltage across a resistor is directly proportional to the current flowing through it"), "The algebraic sum of voltages in any closed loop is equal to zero"),

    Question(6, "What is the function of a capacitor in an electrical circuit?", listOf("To store electrical energy in a magnetic field", "To smooth out voltage fluctuations", "To control the flow of current", "To measure the resistance of a circuit"), "To store electrical energy in a magnetic field"),

    Question(7, "What is the primary purpose of a transformer in electrical systems?", listOf("To convert DC to AC power", "To regulate voltage levels", "To measure electrical resistance", "To control the flow of current"), "To regulate voltage levels"),

    Question(8, "What is the unit of electrical power?", listOf("Ampere", "Watt", "Ohm", "Volt"), "Watt"),

    Question(9, "What is the relationship between current, voltage, and resistance in Ohm's Law?", listOf("V = IR", "P = IV", "R = V/I", "I = PV"), "V = IR"),

    Question(10, "How does the resistance of a conductor change with an increase in temperature?", listOf("Increases", "Decreases", "Remains constant", "Becomes zero"), "Increases")
)
val questionsSafety = listOf(
    Question(11, "What does the term 'grounding' refer to in electrical systems?", listOf("Connecting electrical devices in parallel", "Providing a path for electric current to flow safely into the Earth", "Increasing voltage levels", "Disconnecting electrical devices from power sources"), "Providing a path for electric current to flow safely into the Earth"),

    Question(12, "What is the purpose of a fuse in an electrical circuit?", listOf("To control the flow of current", "To store electrical energy", "To regulate voltage levels", "To protect against overcurrent"), "To protect against overcurrent"),

    Question(13, "Why is it important to use electrical insulators?", listOf("To increase conductivity", "To minimize resistance", "To prevent the flow of electric current", "To enhance voltage levels"), "To prevent the flow of electric current"),

    Question(14, "What safety measure should be taken before working on electrical equipment?", listOf("Wearing metal jewelry for protection", "Using wet hands to increase conductivity", "Isolating the equipment from the power source", "Working alone without informing anyone"), "Isolating the equipment from the power source"),

    Question(15, "What does the acronym 'GFCI' stand for in electrical safety?", listOf("Ground Fault Circuit Interrupter", "General Fuse Control Indicator", "Global Frequency Current Inverter", "Grid Fault Circuit Identifier"), "Ground Fault Circuit Interrupter"),

    Question(16, "Why is it important to label electrical panels and switches?", listOf("To enhance visual appeal", "To confuse individuals working with electricity", "To comply with regulatory requirements", "To increase electrical resistance"), "To comply with regulatory requirements"),

    Question(17, "What is the purpose of a circuit breaker in an electrical system?", listOf("To increase electrical resistance", "To store electrical energy", "To interrupt the flow of current in case of overload or short circuit", "To measure electrical power"), "To interrupt the flow of current in case of overload or short circuit"),

    Question(18, "What safety precautions should be followed when using electrical tools?", listOf("Use tools with damaged insulation", "Wear appropriate personal protective equipment (PPE)", "Ignore warning labels on tools", "Work with electrical tools near water sources"), "Wear appropriate personal protective equipment (PPE)"),

    Question(19, "Why is it important to follow electrical codes and regulations?", listOf("To encourage random electrical practices", "To limit innovation in electrical design", "To ensure safety and reliability in electrical systems", "To increase resistance in electrical circuits"), "To ensure safety and reliability in electrical systems"),

    Question(20, "What is the purpose of an electrical disconnect switch?", listOf("To increase electrical resistance", "To regulate voltage levels", "To disconnect power for maintenance or emergency purposes", "To amplify electric current"), "To disconnect power for maintenance or emergency purposes")
)
val questionPowerGen = listOf(
    Question(21, "What is the primary function of a generator in electric power generation?", listOf("To store electrical energy", "To convert mechanical energy into electrical energy", "To regulate voltage levels", "To measure electrical resistance"), "To convert mechanical energy into electrical energy"),

    Question(22, "What is the difference between alternating current (AC) and direct current (DC)?", listOf("AC flows in one direction, DC changes direction periodically", "AC changes direction periodically, DC flows in one direction", "AC and DC have the same flow direction", "AC and DC both flow in multiple directions"), "AC changes direction periodically, DC flows in one direction"),

    Question(23, "What is the purpose of a step-up transformer in a power distribution system?", listOf("To increase electrical resistance", "To regulate voltage levels", "To convert AC to DC power", "To increase the voltage for long-distance transmission"), "To increase the voltage for long-distance transmission"),

    Question(24, "How is electrical power typically transmitted over long distances?", listOf("Using copper wires", "Using optical fibers", "Using high-voltage transmission lines", "Using low-voltage transmission lines"), "Using high-voltage transmission lines"),

    Question(25, "What is the role of a substation in an electric power distribution network?", listOf("To generate electrical power", "To store electrical energy", "To regulate voltage levels", "To transform voltage for distribution"), "To regulate voltage levels"),

    Question(26, "What is the purpose of a circuit breaker in a power distribution system?", listOf("To increase electrical resistance", "To regulate voltage levels", "To interrupt the flow of current in case of overload or short circuit", "To store electrical energy"), "To interrupt the flow of current in case of overload or short circuit"),

    Question(27, "How does a smart grid contribute to the efficiency of electric power distribution?", listOf("By increasing electrical resistance", "By minimizing the use of renewable energy sources", "By incorporating advanced communication and control technologies", "By randomly changing voltage levels"), "By incorporating advanced communication and control technologies"),

    Question(28, "What is the significance of the term 'load shedding' in power distribution?", listOf("To increase electrical resistance", "To disconnect power for maintenance purposes", "To regulate voltage levels", "To intentionally reduce the load on the power system during peak demand"), "To intentionally reduce the load on the power system during peak demand"),

    Question(29, "What are the advantages of distributed generation in power systems?", listOf("Increased dependence on centralized power plants", "Reduced environmental impact", "Higher transmission losses", "Random distribution of power sources"), "Reduced environmental impact"),

    Question(30, "How does a capacitor contribute to power factor correction in electrical systems?", listOf("By increasing electrical resistance", "By storing electrical energy", "By offsetting reactive power, improving the overall power factor", "By randomly changing voltage levels"), "By offsetting reactive power, improving the overall power factor")
)
val questionsRenewEnergy = listOf(
    Question(31, "What is the primary source of energy in photovoltaic (solar) power systems?", listOf("Wind energy", "Geothermal energy", "Solar radiation", "Hydropower"), "Solar radiation"),

    Question(32, "How does a wind turbine convert wind energy into electrical energy?", listOf("By storing wind energy in batteries", "By directly converting wind energy into electricity", "By converting wind energy into mechanical energy, then into electricity", "By randomly changing the direction of the wind turbine blades"), "By converting wind energy into mechanical energy, then into electricity"),

    Question(33, "What is the purpose of an inverter in a solar power system?", listOf("To increase electrical resistance", "To store electrical energy", "To convert DC power from solar panels to AC power", "To regulate voltage levels"), "To convert DC power from solar panels to AC power"),

    Question(34, "What is the primary advantage of hydropower as a renewable energy source?", listOf("Low environmental impact", "Unlimited availability", "Consistent power output", "Random fluctuations in power supply"), "Consistent power output"),

    Question(35, "How does geothermal power harness energy from the Earth's interior?", listOf("By storing geothermal energy in underground reservoirs", "By directly extracting electrical energy from the Earth's core", "By converting thermal energy from the Earth's interior into electricity", "By randomly drilling into the Earth's crust"), "By converting thermal energy from the Earth's interior into electricity"),

    Question(36, "What is the function of a tidal energy generator in harnessing tidal power?", listOf("To regulate voltage levels", "To increase electrical resistance", "To convert tidal energy into mechanical energy", "To convert tidal energy into electrical energy"), "To convert tidal energy into electrical energy"),

    Question(37, "What is the primary advantage of biomass as a renewable energy source?", listOf("High environmental impact", "Limited availability", "Carbon-neutral characteristics", "Random fluctuations in power supply"), "Carbon-neutral characteristics"),

    Question(38, "How does solar thermal power differ from photovoltaic power generation?", listOf("Solar thermal converts sunlight directly into electricity, photovoltaic converts sunlight into heat", "Photovoltaic converts sunlight directly into electricity, solar thermal converts sunlight into heat", "Both solar thermal and photovoltaic convert sunlight into heat", "Neither solar thermal nor photovoltaic involves sunlight"), "Photovoltaic converts sunlight directly into electricity, solar thermal converts sunlight into heat"),

    Question(39, "What is the primary challenge associated with integrating renewable energy into existing power grids?", listOf("Low public interest in renewable energy", "Inconsistency in renewable energy production", "Overreliance on fossil fuels", "Random changes in grid topology"), "Inconsistency in renewable energy production"),

    Question(40, "How does energy storage contribute to the reliability of renewable energy systems?", listOf("By randomly fluctuating energy storage levels", "By minimizing the need for energy storage", "By providing a backup power source during low renewable energy production", "By increasing electrical resistance"), "By providing a backup power source during low renewable energy production")
)
val questionsMeasurement = listOf(
    Question(41, "What is the basic unit of electrical current?", listOf("Ohm", "Ampere", "Volt", "Watt"), "Ampere"),

    Question(42, "How is resistance measured in a circuit?", listOf("Using an ammeter", "Using a voltmeter", "Using a wattmeter", "Using an ohmmeter"), "Using an ohmmeter"),

    Question(43, "What does a multimeter measure?", listOf("Only voltage", "Only current", "Voltage, current, and resistance", "Power and energy"), "Voltage, current, and resistance"),

    Question(44, "How is electrical power calculated using measurements?", listOf("Power = Voltage x Current", "Power = Voltage / Current", "Power = Current x Resistance", "Power = Voltage + Current"), "Power = Voltage x Current"),

    Question(45, "What is the purpose of a galvanometer?", listOf("To measure electrical power", "To measure electrical resistance", "To measure electric charge", "To detect and measure small electric currents"), "To detect and measure small electric currents"),

    Question(46, "How does an oscilloscope visualize electrical signals?", listOf("In terms of resistance variations", "In a numerical format", "As a graphical representation over time", "As a static image"), "As a graphical representation over time"),

    Question(47, "What is the primary function of a wattmeter?", listOf("To measure electrical resistance", "To measure electric charge", "To measure power in an electrical circuit", "To measure voltage fluctuations"), "To measure power in an electrical circuit"),

    Question(48, "How is capacitance measured in electronic circuits?", listOf("Using an ammeter", "Using a voltmeter", "Using an ohmmeter", "Using a capacitance meter"), "Using a capacitance meter"),

    Question(49, "What is the role of a transducer in electrical measurements?", listOf("To regulate voltage levels", "To convert one form of energy into an electrical signal", "To store electrical energy", "To measure electrical resistance"), "To convert one form of energy into an electrical signal"),

    Question(50, "How is voltage measured across a component in a circuit?", listOf("Using an ammeter", "Using a voltmeter", "Using a wattmeter", "Using an ohmmeter"), "Using a voltmeter")
)
val questionsControl = listOf(
    Question(51, "What is the purpose of a relay in an electrical control system?", listOf("To measure electrical resistance", "To regulate voltage levels", "To control the direction of current flow", "To switch electrical circuits on or off"), "To switch electrical circuits on or off"),

    Question(52, "How does a thermostat function in electrical control systems?", listOf("To convert electrical energy into heat", "To regulate voltage levels", "To detect and control temperature", "To store electrical energy"), "To detect and control temperature"),

    Question(53, "What is the role of a solenoid in an electrical control mechanism?", listOf("To regulate voltage levels", "To convert electrical energy into mechanical motion", "To measure electrical resistance", "To store electrical energy"), "To convert electrical energy into mechanical motion"),

    Question(54, "What does the term 'PID controller' stand for in electrical engineering?", listOf("Proportional-Integral-Derivative", "Power-Isolation-Distribution", "Pulse-Inversion-Delay", "Pressure-Intensity-Decay"), "Proportional-Integral-Derivative"),

    Question(55, "How does a magnetic contactor function in electrical control?", listOf("To regulate voltage levels", "To convert electrical energy into heat", "To control the flow of magnetic fields", "To switch electrical circuits on or off"), "To switch electrical circuits on or off"),

    Question(56, "What is the purpose of a programmable logic controller (PLC) in industrial automation?", listOf("To measure electrical resistance", "To regulate voltage levels", "To store electrical energy", "To control and automate manufacturing processes"), "To control and automate manufacturing processes"),

    Question(57, "How does a feedback control system differ from an open-loop control system?", listOf("Feedback control systems do not require sensors", "Open-loop control systems use feedback to adjust the output", "Feedback control systems do not use a reference signal", "Open-loop control systems do not require a controller"), "Feedback control systems do not use a reference signal"),

    Question(58, "What is the purpose of a surge protector in electrical systems?", listOf("To measure electrical resistance", "To regulate voltage levels", "To protect electronic devices from voltage spikes", "To store electrical energy"), "To protect electronic devices from voltage spikes"),

    Question(59, "What is the primary function of a timer relay in electrical control?", listOf("To measure electrical resistance", "To regulate voltage levels", "To control the flow of electrical current", "To provide time-delayed switching"), "To provide time-delayed switching"),

    Question(60, "How does a motor starter contribute to the operation of electric motors?", listOf("To regulate voltage levels", "To store electrical energy", "To control the speed of the motor", "To initiate and control the motor's operation"), "To initiate and control the motor's operation")
)
val questionsPowerElectronics = listOf(
    Question(61, "What is the purpose of a rectifier in power electronics?", listOf("To store electrical energy", "To regulate voltage levels", "To convert AC to DC", "To control the flow of electrical current"), "To convert AC to DC"),

    Question(62, "How does an inverter function in power electronic systems?", listOf("To measure electrical resistance", "To regulate voltage levels", "To convert DC to AC", "To store electrical energy"), "To convert DC to AC"),

    Question(63, "What is the primary application of a thyristor in power electronics?", listOf("Voltage regulation", "Current sensing", "Switching high-voltage circuits", "Energy storage"), "Switching high-voltage circuits"),

    Question(64, "How does a power diode contribute to electrical circuits?", listOf("To store electrical energy", "To regulate voltage levels", "To amplify electrical signals", "To allow current flow in one direction"), "To allow current flow in one direction"),

    Question(65, "What is the function of a power MOSFET in electronic devices?", listOf("To measure electrical resistance", "To regulate voltage levels", "To amplify electrical signals", "To switch high currents"), "To switch high currents"),

    Question(66, "How does a voltage regulator improve the stability of power supplies?", listOf("By randomly fluctuating output voltage", "By providing a constant output voltage despite input variations", "By converting AC to DC power", "By amplifying electrical signals"), "By providing a constant output voltage despite input variations"),

    Question(67, "What is the purpose of a flyback transformer in power electronics?", listOf("To measure electrical resistance", "To regulate voltage levels", "To store electrical energy", "To provide isolation in high-frequency applications"), "To provide isolation in high-frequency applications"),

    Question(68, "How does a surge suppressor protect electronic devices?", listOf("By increasing electrical resistance", "By regulating voltage levels", "By absorbing and redirecting excess voltage", "By converting AC to DC power"), "By absorbing and redirecting excess voltage"),

    Question(69, "What is the primary function of an uninterruptible power supply (UPS)?", listOf("To measure electrical resistance", "To regulate voltage levels", "To store electrical energy", "To provide temporary power during outages"), "To provide temporary power during outages"),

    Question(70, "How does a resonant converter operate in power electronic systems?", listOf("By randomly changing frequency", "By resonating at a specific frequency for efficient power conversion", "By regulating voltage levels", "By storing electrical energy"), "By resonating at a specific frequency for efficient power conversion")
)
val questionsEmergingTech = listOf(
    Question(71, "What is the significance of wide-bandgap semiconductors in power electronics?", listOf("To increase electrical resistance", "To regulate voltage levels", "To enable higher operating temperatures and efficiency", "To store electrical energy"), "To enable higher operating temperatures and efficiency"),

    Question(72, "How does microgrid technology contribute to power systems?", listOf("By randomly fluctuating power supply", "By providing backup power only", "By integrating distributed energy resources for local power generation", "By increasing dependency on centralized grids"), "By integrating distributed energy resources for local power generation"),

    Question(73, "What is the role of power factor correction in modern power systems?", listOf("To measure electrical resistance", "To regulate voltage levels", "To improve power quality by minimizing reactive power", "To store electrical energy"), "To improve power quality by minimizing reactive power"),

    Question(74, "How does energy harvesting technology contribute to power systems?", listOf("By randomly fluctuating energy harvesting levels", "By converting wasted energy into electrical power", "By minimizing energy consumption", "By increasing electrical resistance"), "By converting wasted energy into electrical power"),

    Question(75, "What is the purpose of a superconductor in power applications?", listOf("To regulate voltage levels", "To store electrical energy", "To conduct electricity with zero resistance", "To increase electrical resistance"), "To conduct electricity with zero resistance"),

    Question(76, "How does the Internet of Things (IoT) impact smart grid technology?", listOf("By randomly disconnecting devices", "By decreasing connectivity among devices", "By enabling communication and control among interconnected devices", "By regulating voltage levels"), "By enabling communication and control among interconnected devices"),

    Question(77, "What is the role of artificial intelligence (AI) in power systems?", listOf("To increase electrical resistance", "To regulate voltage levels", "To enhance grid monitoring, control, and optimization", "To store electrical energy"), "To enhance grid monitoring, control, and optimization"),

    Question(78, "How does demand response contribute to energy management?", listOf("By randomly fluctuating demand for electricity", "By decreasing consumer control over energy use", "By allowing consumers to adjust their electricity usage in response to price signals", "By regulating voltage levels"), "By allowing consumers to adjust their electricity usage in response to price signals"),

    Question(79, "What is the significance of energy storage systems in grid applications?", listOf("To measure electrical resistance", "To regulate voltage levels", "To store excess energy for later use", "To convert AC to DC power"), "To store excess energy for later use"),

    Question(80, "How does blockchain technology impact energy trading in decentralized power systems?", listOf("By randomly fluctuating blockchain transactions", "By ensuring transparency and security in energy transactions", "By minimizing blockchain applications in energy trading", "By regulating voltage levels"), "By ensuring transparency and security in energy transactions")
)
val questionsdspPS = listOf(
    Question(81, "What is the primary purpose of digital signal processing (DSP) in power systems?", listOf("To increase electrical resistance", "To regulate voltage levels", "To enhance the analysis and control of electrical signals", "To store electrical energy"), "To enhance the analysis and control of electrical signals"),

    Question(82, "How does a digital protective relay contribute to power system protection?", listOf("By randomly changing protection settings", "By providing delayed responses to faults", "By processing digital signals to quickly detect and isolate faults", "By regulating voltage levels"), "By processing digital signals to quickly detect and isolate faults"),

    Question(83, "What role does Fourier analysis play in digital signal processing for power systems?", listOf("To measure electrical resistance", "To regulate voltage levels", "To decompose complex waveforms into sinusoidal components", "To store electrical energy"), "To decompose complex waveforms into sinusoidal components"),

    Question(84, "How is power quality monitoring improved with the use of digital signal processing techniques?", listOf("By randomly fluctuating power quality parameters", "By providing real-time analysis of voltage and current waveforms", "By ignoring voltage sags and swells", "By regulating voltage levels"), "By providing real-time analysis of voltage and current waveforms"),

    Question(85, "What is the purpose of a phasor measurement unit (PMU) in power systems?", listOf("To measure electrical resistance", "To regulate voltage levels", "To provide synchronized phasor data for real-time monitoring", "To store electrical energy"), "To provide synchronized phasor data for real-time monitoring"),

    Question(86, "How does digital signal processing contribute to the control of power electronic devices?", listOf("By randomly changing control signals", "By analyzing analog signals only", "By processing digital signals to generate precise control signals", "By regulating voltage levels"), "By processing digital signals to generate precise control signals"),

    Question(87, "What is the significance of adaptive filtering in power system applications?", listOf("To increase electrical resistance", "To regulate voltage levels", "To automatically adjust filter parameters based on changing conditions", "To store electrical energy"), "To automatically adjust filter parameters based on changing conditions"),

    Question(88, "How is fault location improved using digital signal processing methods?", listOf("By randomly estimating fault locations", "By ignoring fault conditions", "By processing digital signals to accurately locate faults", "By regulating voltage levels"), "By processing digital signals to accurately locate faults"),

    Question(89, "What is the role of state estimation in power systems, enhanced by digital signal processing?", listOf("To measure electrical resistance", "To regulate voltage levels", "To estimate the current state of the power system using measurements and mathematical models", "To store electrical energy"), "To estimate the current state of the power system using measurements and mathematical models"),

    Question(90, "How does digital filtering contribute to noise reduction in power system signals?", listOf("By randomly changing filter parameters", "By increasing noise levels", "By processing digital signals to attenuate unwanted frequency components", "By regulating voltage levels"), "By processing digital signals to attenuate unwanted frequency components")
)


// Elecronics List Questions

val analogElectronicsQuestions = listOf(
    Question(1, "What is the function of an operational amplifier (op-amp) in electronic circuits?", listOf("To store electrical energy", "To amplify voltage signals", "To regulate voltage levels", "To measure electrical resistance"), "To amplify voltage signals"),

    Question(2, "In a transistor amplifier circuit, what is the purpose of biasing?", listOf("To increase electrical resistance", "To regulate voltage levels", "To establish a stable operating point", "To store electrical energy"), "To establish a stable operating point"),

    Question(3, "What is the primary function of a diode in electronic circuits?", listOf("To amplify signals", "To store electrical energy", "To control the flow of current in one direction", "To measure voltage"), "To control the flow of current in one direction"),

    Question(4, "How does a capacitor filter high-frequency noise in power supply circuits?", listOf("By randomly changing capacitance", "By storing electrical energy", "By blocking low-frequency signals", "By allowing high-frequency signals to pass while attenuating low frequencies"), "By allowing high-frequency signals to pass while attenuating low frequencies"),

    Question(5, "What is the purpose of negative feedback in amplifier circuits?", listOf("To increase electrical resistance", "To regulate voltage levels", "To decrease gain and improve stability", "To store electrical energy"), "To decrease gain and improve stability"),

    Question(6, "What does the term 'crossover distortion' refer to in class B amplifier circuits?", listOf("Random variations in amplifier gain", "Amplifier instability", "Distortion caused by overlapping of transistor switching regions", "Fluctuations in power supply voltage"), "Distortion caused by overlapping of transistor switching regions"),

    Question(7, "How does a voltage regulator maintain a constant output voltage despite changes in input voltage or load current?", listOf("By randomly changing the output voltage", "By storing electrical energy", "By using feedback to adjust the regulator's operation", "By regulating the temperature of electronic components"), "By using feedback to adjust the regulator's operation"),

    Question(8, "What is the purpose of a flyback diode in a relay circuit?", listOf("To measure electrical resistance", "To regulate voltage levels", "To prevent voltage spikes when the relay is turned off", "To store electrical energy"), "To prevent voltage spikes when the relay is turned off"),

    Question(9, "In a multivibrator circuit, what is the role of positive feedback?", listOf("To increase electrical resistance", "To regulate voltage levels", "To sustain oscillations by reinforcing the input signal", "To store electrical energy"), "To sustain oscillations by reinforcing the input signal"),

    Question(10, "How does a phase-locked loop (PLL) maintain synchronization between input and output signals?", listOf("By randomly changing the phase of the output signal", "By storing electrical energy", "By adjusting the phase of the output signal based on feedback", "By regulating voltage levels"), "By adjusting the phase of the output signal based on feedback")
)
val digitalElectronicsQuestions = listOf(
    Question(11, "What is the fundamental building block of digital circuits?", listOf("Transistor", "Capacitor", "Resistor", "Diode"), "Transistor"),

    Question(12, "What is the binary representation of the decimal number 13?", listOf("1101", "1011", "1110", "1001"), "1101"),

    Question(13, "In a logic gate, what does the AND operation perform?", listOf("Outputs true if both inputs are true", "Outputs true if either input is true", "Outputs true if only one input is true", "Outputs true if neither input is true"), "Outputs true if both inputs are true"),

    Question(14, "How is data stored in a D flip-flop?", listOf("As a pulse-width modulated signal", "As an analog voltage level", "As a continuous wave", "As a digital state with one or zero"), "As a digital state with one or zero"),

    Question(15, "What is the primary purpose of a multiplexer in digital systems?", listOf("To amplify signals", "To store electrical energy", "To select one of several input data lines and route it to a single output", "To measure voltage"), "To select one of several input data lines and route it to a single output"),

    Question(16, "How does a counter differ from a shift register in digital circuits?", listOf("A counter stores data, while a shift register counts pulses", "A counter counts pulses, while a shift register stores data", "Both counter and shift register perform the same function", "Neither counter nor shift register stores or counts data"), "A counter counts pulses, while a shift register stores data"),

    Question(17, "What is the role of a decoder in digital systems?", listOf("To increase electrical resistance", "To regulate voltage levels", "To convert binary-coded input into a specific output", "To store electrical energy"), "To convert binary-coded input into a specific output"),

    Question(18, "In digital communication, what does the term 'bit rate' represent?", listOf("The number of bits transmitted per unit of time", "The voltage level of a single bit", "The frequency of the digital signal", "The time delay between bits"), "The number of bits transmitted per unit of time"),

    Question(19, "What is the function of an arithmetic logic unit (ALU) in a microprocessor?", listOf("To measure electrical resistance", "To regulate voltage levels", "To perform arithmetic and logic operations on binary data", "To store electrical energy"), "To perform arithmetic and logic operations on binary data"),

    Question(20, "How does a flip-flop differ from a latch in digital circuits?", listOf("A flip-flop is edge-triggered, while a latch is level-triggered", "A latch is edge-triggered, while a flip-flop is level-triggered", "Both flip-flop and latch perform the same function", "Neither flip-flop nor latch is used in digital circuits"), "A flip-flop is edge-triggered, while a latch is level-triggered")
)
val semiconductorDevicesQuestions = listOf(
    Question(21, "What is the fundamental function of a semiconductor diode?", listOf("To store electrical energy", "To amplify signals", "To regulate voltage levels", "To control the flow of current in one direction"), "To control the flow of current in one direction"),

    Question(22, "How does a transistor amplify signals in electronic circuits?", listOf("By randomly changing its internal resistance", "By storing electrical energy", "By controlling the flow of current between its terminals", "By regulating voltage levels"), "By controlling the flow of current between its terminals"),

    Question(23, "What is the primary function of a semiconductor in integrated circuits?", listOf("To increase electrical resistance", "To regulate voltage levels", "To store electrical energy", "To perform electronic functions such as amplification and switching"), "To perform electronic functions such as amplification and switching"),

    Question(24, "How does a field-effect transistor (FET) differ from a bipolar junction transistor (BJT)?", listOf("FET uses only one type of charge carrier, while BJT uses both", "FET has three terminals, while BJT has four", "FET is a current-controlled device, while BJT is a voltage-controlled device", "FET cannot be used for amplification"), "FET is a current-controlled device, while BJT is a voltage-controlled device"),

    Question(25, "What is the purpose of a Zener diode in electronic circuits?", listOf("To store electrical energy", "To regulate voltage levels", "To amplify signals", "To control the flow of current in one direction"), "To regulate voltage levels"),

    Question(26, "How does a photodiode function in electronic devices?", listOf("By randomly changing its internal resistance", "By storing electrical energy", "By converting light into electrical current", "By regulating voltage levels"), "By converting light into electrical current"),

    Question(27, "What is the role of a thyristor in power electronic circuits?", listOf("To increase electrical resistance", "To regulate voltage levels", "To control the flow of current in one direction", "To store electrical energy"), "To control the flow of current in one direction"),

    Question(28, "How does a semiconductor laser operate in optical communication systems?", listOf("By randomly changing its emission wavelength", "By storing electrical energy", "By emitting coherent light through stimulated emission of photons", "By regulating voltage levels"), "By emitting coherent light through stimulated emission of photons"),

    Question(29, "What is the function of a Schottky diode in high-frequency applications?", listOf("To increase electrical resistance", "To regulate voltage levels", "To store electrical energy", "To provide fast switching with low forward voltage drop"), "To provide fast switching with low forward voltage drop"),

    Question(30, "How does a semiconductor memory chip store and retrieve data?", listOf("By randomly changing its internal resistance", "By storing electrical energy", "By using the presence or absence of charge to represent binary data", "By regulating voltage levels"), "By using the presence or absence of charge to represent binary data")
)
val dspElectronicsQuestions = listOf(
    Question(31, "What is the primary role of digital signal processing (DSP) in electronic systems?", listOf("To increase electrical resistance", "To regulate voltage levels", "To enhance the analysis and processing of digital signals", "To store electrical energy"), "To enhance the analysis and processing of digital signals"),

    Question(32, "How does a digital filter differ from an analog filter in signal processing?", listOf("Digital filters use continuous signal processing techniques", "Analog filters operate on digital signals", "Digital filters process discrete-time signals using digital computation", "Analog filters are more efficient in digital systems"), "Digital filters process discrete-time signals using digital computation"),

    Question(33, "What is the significance of the Fast Fourier Transform (FFT) in DSP?", listOf("To increase electrical resistance", "To regulate voltage levels", "To efficiently compute the discrete Fourier transform of a signal", "To store electrical energy"), "To efficiently compute the discrete Fourier transform of a signal"),

    Question(34, "How does a digital oscilloscope differ from an analog oscilloscope?", listOf("Digital oscilloscopes display signals in the time domain only", "Analog oscilloscopes offer higher resolution", "Digital oscilloscopes use analog-to-digital converters and process signals digitally", "Analog oscilloscopes are more portable"), "Digital oscilloscopes use analog-to-digital converters and process signals digitally"),

    Question(35, "What is the purpose of a digital-to-analog converter (DAC) in electronic systems?", listOf("To increase electrical resistance", "To regulate voltage levels", "To convert digital signals into analog signals", "To store electrical energy"), "To convert digital signals into analog signals"),

    Question(36, "How does a digital audio processor enhance sound quality in audio systems?", listOf("By randomly changing audio frequencies", "By storing electrical energy", "By processing digital audio signals to reduce noise and enhance clarity", "By regulating voltage levels"), "By processing digital audio signals to reduce noise and enhance clarity"),

    Question(37, "What is the role of a digital signal processor (DSP) in modern audio applications?", listOf("To increase electrical resistance", "To regulate voltage levels", "To perform real-time processing and manipulation of audio signals", "To store electrical energy"), "To perform real-time processing and manipulation of audio signals"),

    Question(38, "How does digital modulation differ from analog modulation in communication systems?", listOf("Digital modulation uses continuous waveforms", "Analog modulation represents information using discrete states", "Digital modulation converts digital data into analog signals", "Analog modulation is more immune to noise"), "Digital modulation converts digital data into analog signals"),

    Question(39, "What is the function of a digital signal processor in image processing applications?", listOf("To increase electrical resistance", "To regulate voltage levels", "To analyze and manipulate digital images with high-speed processing", "To store electrical energy"), "To analyze and manipulate digital images with high-speed processing"),

    Question(40, "How does error detection and correction work in digital communication systems?", listOf("By randomly changing transmitted data", "By storing electrical energy", "By adding redundant information to detect and correct errors", "By regulating voltage levels"), "By adding redundant information to detect and correct errors")
)
val communicationSystemsQuestions = listOf(
    Question(41, "What is the purpose of modulation in communication systems?", listOf("To increase electrical resistance", "To regulate voltage levels", "To carry information on a carrier signal", "To store electrical energy"), "To carry information on a carrier signal"),

    Question(42, "How does amplitude modulation (AM) differ from frequency modulation (FM)?", listOf("AM varies the frequency of the carrier, while FM varies the amplitude", "AM and FM are identical modulation techniques", "AM varies both amplitude and frequency, while FM varies only amplitude", "AM and FM have no differences"), "AM varies both amplitude and frequency, while FM varies only amplitude"),

    Question(43, "What is the role of a demodulator in a communication receiver?", listOf("To increase electrical resistance", "To regulate voltage levels", "To extract the original information signal from the modulated carrier", "To store electrical energy"), "To extract the original information signal from the modulated carrier"),

    Question(44, "How does a phase-locked loop (PLL) contribute to communication systems?", listOf("By randomly changing its phase", "By storing electrical energy", "By synchronizing the receiver's local oscillator with the incoming signal", "By regulating voltage levels"), "By synchronizing the receiver's local oscillator with the incoming signal"),

    Question(45, "What is the significance of error detection and correction in digital communication?", listOf("To increase electrical resistance", "To regulate voltage levels", "To ensure accurate transmission of data by detecting and correcting errors", "To store electrical energy"), "To ensure accurate transmission of data by detecting and correcting errors"),

    Question(46, "How does a repeater improve the performance of communication networks?", listOf("By randomly changing transmitted signals", "By storing electrical energy", "By amplifying and retransmitting signals to extend the communication range", "By regulating voltage levels"), "By amplifying and retransmitting signals to extend the communication range"),

    Question(47, "What is the purpose of error-checking codes in digital communication?", listOf("To increase electrical resistance", "To regulate voltage levels", "To encode data with redundant information for error detection", "To store electrical energy"), "To encode data with redundant information for error detection"),

    Question(48, "How does multiplexing enable the transmission of multiple signals over a shared communication channel?", listOf("By randomly changing signal frequencies", "By storing electrical energy", "By combining multiple signals into a composite signal for simultaneous transmission", "By regulating voltage levels"), "By combining multiple signals into a composite signal for simultaneous transmission"),

    Question(49, "What is the function of a communication protocol in data transmission?", listOf("To increase electrical resistance", "To regulate voltage levels", "To define rules and conventions for communication between devices", "To store electrical energy"), "To define rules and conventions for communication between devices"),

    Question(50, "How does a satellite communication system differ from a terrestrial communication system?", listOf("Satellite communication uses cables for transmission", "Terrestrial communication relies on signals from space", "Satellite communication involves communication between Earth-based stations via satellites", "Terrestrial communication relies on signals from extraterrestrial sources"), "Satellite communication involves communication between Earth-based stations via satellites")
)
val microwaveRadarQuestions = listOf(
    Question(51, "What is the frequency range typically associated with microwave signals?", listOf("Below 1 Hz", "1 GHz to 30 GHz", "30 MHz to 1 GHz", "Above 300 GHz"), "1 GHz to 30 GHz"),

    Question(52, "How does a waveguide contribute to the transmission of microwave signals?", listOf("By randomly changing the direction of signals", "By storing electrical energy", "By confining and guiding microwave signals along a metallic structure", "By regulating voltage levels"), "By confining and guiding microwave signals along a metallic structure"),

    Question(53, "What is the primary application of a microwave antenna in communication systems?", listOf("To increase electrical resistance", "To regulate voltage levels", "To transmit and receive microwave signals", "To store electrical energy"), "To transmit and receive microwave signals"),

    Question(54, "How does a radar system determine the range of a target?", listOf("By randomly changing the target's position", "By storing electrical energy", "By measuring the time delay between signal transmission and reception", "By regulating voltage levels"), "By measuring the time delay between signal transmission and reception"),

    Question(55, "What is the purpose of a duplexer in a radar system?", listOf("To increase electrical resistance", "To regulate voltage levels", "To transmit and receive signals using the same antenna", "To store electrical energy"), "To transmit and receive signals using the same antenna"),

    Question(56, "How does pulse compression enhance radar performance?", listOf("By randomly changing pulse durations", "By storing electrical energy", "By improving target range resolution and reducing susceptibility to interference", "By regulating voltage levels"), "By improving target range resolution and reducing susceptibility to interference"),

    Question(57, "What is the function of a magnetron in microwave systems?", listOf("To increase electrical resistance", "To regulate voltage levels", "To generate microwave signals for radar and communication", "To store electrical energy"), "To generate microwave signals for radar and communication"),

    Question(58, "How does a phased array antenna system contribute to radar beam steering?", listOf("By randomly changing signal frequencies", "By storing electrical energy", "By adjusting the phase of signals from individual antenna elements", "By regulating voltage levels"), "By adjusting the phase of signals from individual antenna elements"),

    Question(59, "What is the significance of radar signal processing in target identification?", listOf("To increase electrical resistance", "To regulate voltage levels", "To extract and analyze information from received radar signals for target identification", "To store electrical energy"), "To extract and analyze information from received radar signals for target identification"),

    Question(60, "How does radar absorbent material (RAM) contribute to stealth technology?", listOf("By randomly changing the radar's operating frequency", "By storing electrical energy", "By reducing the reflection of radar signals from stealth aircraft", "By regulating voltage levels"), "By reducing the reflection of radar signals from stealth aircraft")
)
val embeddedSystemsQuestions = listOf(
    Question(61, "What defines an embedded system?", listOf("To increase electrical resistance", "To regulate voltage levels", "A specialized computing system designed for specific tasks within a larger system", "To store electrical energy"), "A specialized computing system designed for specific tasks within a larger system"),

    Question(62, "How does a microcontroller differ from a microprocessor?", listOf("Microcontrollers lack integrated memory", "Microprocessors have fewer I/O capabilities", "Microcontrollers are designed for specific tasks and include integrated memory and peripherals", "Microprocessors are only used in embedded systems"), "Microcontrollers are designed for specific tasks and include integrated memory and peripherals"),

    Question(63, "What is the purpose of firmware in embedded systems?", listOf("To increase electrical resistance", "To regulate voltage levels", "To provide low-level control and operational instructions for the hardware", "To store electrical energy"), "To provide low-level control and operational instructions for the hardware"),

    Question(64, "How does real-time operating system (RTOS) differ from a general-purpose operating system?", listOf("RTOS cannot handle real-time tasks", "General-purpose operating systems lack multitasking capabilities", "RTOS is designed for time-sensitive applications and guarantees timely task execution", "General-purpose operating systems are only used in embedded systems"), "RTOS is designed for time-sensitive applications and guarantees timely task execution"),

    Question(65, "What role does a watchdog timer play in embedded systems?", listOf("To increase electrical resistance", "To regulate voltage levels", "To monitor the system's operation and reset it if necessary", "To store electrical energy"), "To monitor the system's operation and reset it if necessary"),

    Question(66, "How does flash memory contribute to program storage in embedded systems?", listOf("By randomly changing stored data", "By storing electrical energy", "By providing non-volatile storage for program code", "By regulating voltage levels"), "By providing non-volatile storage for program code"),

    Question(67, "What is the significance of interrupt handling in microcontrollers?", listOf("To increase electrical resistance", "To regulate voltage levels", "To enable the processor to respond to external events or signals asynchronously", "To store electrical energy"), "To enable the processor to respond to external events or signals asynchronously"),

    Question(68, "How does the input/output (I/O) subsystem impact the functionality of embedded systems?", listOf("By randomly changing I/O configurations", "By storing electrical energy", "By facilitating communication between the microcontroller and external devices", "By regulating voltage levels"), "By facilitating communication between the microcontroller and external devices"),

    Question(69, "What is the purpose of analog-to-digital converters (ADC) in embedded systems?", listOf("To increase electrical resistance", "To regulate voltage levels", "To convert analog signals into digital data for processing", "To store electrical energy"), "To convert analog signals into digital data for processing"),

    Question(70, "How does power management contribute to the efficiency of embedded systems?", listOf("By randomly changing power consumption levels", "By storing electrical energy", "By optimizing power usage to extend battery life and reduce energy consumption", "By regulating voltage levels"), "By optimizing power usage to extend battery life and reduce energy consumption")
)
val aiElectronicsQuestions = listOf(
    Question(71, "What is the role of artificial intelligence (AI) in electronic systems?", listOf("To increase electrical resistance", "To regulate voltage levels", "To enable machines to perform tasks that typically require human intelligence", "To store electrical energy"), "To enable machines to perform tasks that typically require human intelligence"),

    Question(72, "How does machine learning differ from traditional programming in electronic applications?", listOf("Machine learning uses predefined rules", "Traditional programming relies on artificial intelligence algorithms", "Machine learning allows systems to learn from data and improve over time", "Traditional programming is only used in AI applications"), "Machine learning allows systems to learn from data and improve over time"),

    Question(73, "What is the significance of neural networks in electronic systems?", listOf("To increase electrical resistance", "To regulate voltage levels", "To model complex patterns and relationships in data", "To store electrical energy"), "To model complex patterns and relationships in data"),

    Question(74, "How does a neural network-based speech recognition system operate?", listOf("By randomly changing speech patterns", "By storing electrical energy", "By learning and recognizing speech patterns through neural network training", "By regulating voltage levels"), "By learning and recognizing speech patterns through neural network training"),

    Question(75, "What role does reinforcement learning play in optimizing electronic control systems?", listOf("To increase electrical resistance", "To regulate voltage levels", "To enable systems to learn optimal behavior through trial and error", "To store electrical energy"), "To enable systems to learn optimal behavior through trial and error"),

    Question(76, "How does computer vision contribute to electronic devices?", listOf("By randomly changing visual perceptions", "By storing electrical energy", "By enabling machines to interpret and understand visual information", "By regulating voltage levels"), "By enabling machines to interpret and understand visual information"),

    Question(77, "What is the purpose of natural language processing (NLP) in electronic applications?", listOf("To increase electrical resistance", "To regulate voltage levels", "To enable machines to understand and respond to human language", "To store electrical energy"), "To enable machines to understand and respond to human language"),

    Question(78, "How do electronic systems use AI for predictive maintenance?", listOf("By randomly changing maintenance schedules", "By storing electrical energy", "By analyzing data to predict when equipment is likely to fail and scheduling maintenance proactively", "By regulating voltage levels"), "By analyzing data to predict when equipment is likely to fail and scheduling maintenance proactively"),

    Question(79, "What challenges are associated with integrating AI into electronic systems?", listOf("There are no challenges", "Challenges include ethical concerns and data privacy issues", "AI integration is always seamless", "Challenges are limited to technical issues"), "Challenges include ethical concerns and data privacy issues"),

    Question(80, "How does AI contribute to the optimization of power consumption in electronic devices?", listOf("By randomly changing power consumption levels", "By storing electrical energy", "By analyzing usage patterns and adjusting power settings for efficiency", "By regulating voltage levels"), "By analyzing usage patterns and adjusting power settings for efficiency")
)
val quantumComputingQuestions = listOf(
    Question(81, "What is the fundamental unit of quantum information in quantum computing?", listOf("Bit", "Quantum bit or qubit", "Byte", "Nibble"), "Quantum bit or qubit"),

    Question(82, "How does superposition enhance the computational power of quantum computers?", listOf("By randomly changing computational states", "By storing electrical energy", "By allowing qubits to exist in multiple states simultaneously", "By regulating voltage levels"), "By allowing qubits to exist in multiple states simultaneously"),

    Question(83, "What is entanglement in the context of quantum computing?", listOf("Random entanglement of qubits", "Storing electrical energy in qubits", "A quantum phenomenon where qubits become correlated and share information", "Regulating voltage levels in qubits"), "A quantum phenomenon where qubits become correlated and share information"),

    Question(84, "How does quantum parallelism contribute to the speedup of quantum algorithms?", listOf("By randomly changing algorithm steps", "By storing electrical energy in quantum states", "By performing multiple computations simultaneously on different quantum states", "By regulating voltage levels in quantum circuits"), "By performing multiple computations simultaneously on different quantum states"),

    Question(85, "What is quantum entanglement's role in quantum teleportation?", listOf("Randomly changing the teleportation destination", "Storing electrical energy during teleportation", "Creating a connection between entangled particles for information transfer", "Regulating voltage levels during teleportation"), "Creating a connection between entangled particles for information transfer"),

    Question(86, "How do quantum gates differ from classical logic gates in electronic circuits?", listOf("Quantum gates operate at slower speeds", "Quantum gates use classical bits for computation", "Quantum gates manipulate quantum bits and can exist in superposition", "Quantum gates have limited applications"), "Quantum gates manipulate quantum bits and can exist in superposition"),

    Question(87, "What is the significance of quantum algorithms such as Shor's algorithm and Grover's algorithm?", listOf("They have no practical applications", "They demonstrate the limitations of quantum computing", "They showcase the power of quantum computers for factoring and searching tasks", "They are only used in classical computing"), "They showcase the power of quantum computers for factoring and searching tasks"),

    Question(88, "How does quantum error correction work in quantum computing?", listOf("By randomly changing quantum states", "By storing electrical energy in qubits", "By detecting and correcting errors that may occur during quantum computation", "By regulating voltage levels in quantum circuits"), "By detecting and correcting errors that may occur during quantum computation"),

    Question(89, "What challenges are associated with the practical implementation of quantum computers?", listOf("There are no challenges", "Challenges include maintaining qubit coherence and minimizing errors", "Quantum computers have no practical applications", "Challenges are limited to classical computing"), "Challenges include maintaining qubit coherence and minimizing errors"),

    Question(90, "How might quantum computing impact the field of cryptography?", listOf("No impact on cryptography", "It enhances the security of classical cryptographic algorithms", "It poses a potential threat to current cryptographic systems based on factorization", "It only affects quantum cryptography"), "It poses a potential threat to current cryptographic systems based on factorization")
)





