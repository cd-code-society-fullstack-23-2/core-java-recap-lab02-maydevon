## Part A - The Box of 10 Times Challenge at Code Differently 📦✨

### Description:

Hello, Code Explorer! 🕵️🚀 We've prepared a fun puzzle for you. Given a list of numbers, can you turn each number into a number that's 10 times bigger, unless the number is already a friend of 10? Unpack the list, make those changes, and see the magic happen!

### Example 1:

**Input:**
list: [10, 3, 5, 6]

**Output:**
[10, 30, 50, 60]

**Making the Change:**

- **10** stays **10** (because 10 loves itself!)
- **3** turns into **30** (because 3 times 10 is 30)
- **5** turns into **50** (because 5 times 10 is 50)
- **6** turns into **60** (because 6 times 10 is 60)

### Example 2:

**Input:**
list: [7, 2, 10, 9]

**Output:**
[70, 20, 10, 90]

**Making the Change:**

- **7** turns into **70** (because 7 times 10 is 70)
- **2** turns into **20** (because 2 times 10 is 20)
- **10** stays **10** (10 just stays as it is!)
- **9** turns into **90** (because 9 times 10 is 90)

### Submission:
After you've multiplied and marvelled, be sure to share your masterpiece on GitHub. Show everyone how you embrace challenges and really Code Differently! 🎉🌟

## Part B: Health Club Management System: Java Lab

### Overview:
Students will design and implement a Health Club Management System. This system will handle new memberships, trainer allocations, and class schedules. The lab emphasizes object-oriented design, use of enumerations, and basic data operations in an ArrayList.

### Java Topics Included in This Lab:

- Classes and Objects
- ArrayList
- Custom Class Design and Implementation
- Object-Oriented Relationships (Inheritance, Composition)
- Enumerations
- Overriding toString() method

## Custom Classes:

### Person Class

*Similar to the library system, most entities in this domain would extend the basic details of a person.*

**Attributes**:

- name: String
- age: Integer

**Methods**:

- _(name, age)
- getName(): String
- setName(String): void
- getAge(): Integer
- setAge(Integer): void
- toString(): String

### HealthClub Class

**Attributes**:

- members: ArrayList
- trainers: ArrayList
- classes: ArrayList

**Methods**:

- _()
- addMember(Member): void
- removeMember(Member): Boolean
- addTrainer(Trainer): void
- addClass(FitnessClass): void
- searchMember(name): Member
- searchTrainer(name): Trainer
- toString(): String

### Member Class (extends Person)

**Attributes**:

- static memberCount: int
- id: int
- membershipType: MembershipType
- workoutPlan: String

**Methods**:

- _(name, age, membershipType)
- updateWorkoutPlan(String): void
- getMembershipType(): MembershipType
- setMembershipType(MembershipType): void
- toString(): String

### Trainer Class (extends Person)

**Attributes**:

- static trainerCount: int
- trainerID: int
- expertise: FitnessCategory

**Methods**:
- _(name, age, expertise)
- assignWorkoutPlan(Member, workoutPlan): void
- toString(): String

### Fitness Class

**Attributes**:

- className: String
- trainer: Trainer
- schedule: String
- category: FitnessCategory

**Methods**:

- _(className, trainer, schedule, category)
- getSchedule(): String
- setSchedule(String): void
- toString(): String

## Enumerations:

### MembershipType

- BASIC
- PREMIUM
- GOLD

### FitnessCategory

- AEROBICS
- YOGA
- STRENGTH_TRAINING
- CARDIO
- DANCE

## User Stories and Requirements:

**User Story:** As a health club, I want to register a new member.
Requirements:
- Use the HealthClub class's addMember() method to add a new member instance to the members ArrayList.
- Assign each member a unique ID using the memberCount static attribute.

**User Story:** As a health club, I want to hire a new trainer.
Requirements:
- Use the HealthClub's addTrainer() method to add a new trainer instance to the trainers ArrayList.
- Assign each trainer a unique ID using the trainerCount static attribute.

**User Story:** As a member, I want a trainer to assign me a workout plan.
Requirements:
- Use the Trainer class's assignWorkoutPlan() method to assign workout plans to members.

**User Story:** As a health club, I want to schedule fitness classes.
Requirements:

- Use the HealthClub class's addClass() method.
- Assign a trainer to the class and set a schedule.

**User Story:** As a health club, I want to categorize trainers based on their expertise.

Requirements:

- Use the FitnessCategory enumeration for specifying a trainer's expertise (e.g., Aerobics, Yoga, Strength Training, etc.).
- Display the expertise when using the Trainer class's toString() method.

**User Story:** As a user, I want a clear representation of entities in textual format.
Requirements:

- Override the toString() method in each class (Person, HealthClub, Member, Trainer, FitnessClass) to return a readable string representation of its attributes.