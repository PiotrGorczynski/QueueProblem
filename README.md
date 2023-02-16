# <p align="center"> Queue Problem </p>
<p align="center"> <b>Program solves followed problem:</b> </p>


<p align="justify"> Program solves the problem where person 
may come to do some shopping and encounter a queue in the store. Such a person may line up and
wait. If she waits, her turn may come and she may enter the store. It may also conclude that
enough and go away. Program gives
the ability to perform the operations that have been mentioned, i.e. adding a person to the queue, queue
moves forward, the person lets go and leaves the line.
Problem with a person with the same first and last name is fixed following: by the counter, the counter is increased to be able to define 2 people. This is needed for further logic in the program. If person_1 is no longer in the queue and
another person comes, he is to receive number 3, not 1. There are also VIPs, i.e. people who, when they come, go to the beginning of the queue. </p>  <p align="center"> <b> Commands: </b> </p>

<p align="justify"> * ADD PERSON(Tomasz_Romański) - such a person will line up, we separate the name and surname with the floor.
If you duplicate a person, the counter will be increased. A person can only have one name and
last name. </p>
<p align="justify"> * ADD PERSON(Tomasz_Romański,VIP) - such a guest is a VIP.</p>
<p align="justify"> * PROCESS - the queue will move one person forward, ie each person waiting in the queue
will move forward one place. </p>
 <p align="justify"> * LEAVE PERSON(Tomasz_Romański_2) - a person with this name and surname (here you can see what this field is for
counter to unambiguously identify which person we are talking about) forgoes queuing and
it goes. The other people then move forward in the queue. </p>


<p align="justify"> If the program does not recognize the command, it is to print a message on the screen that the command is incorrect. 
The content of the queue was printed on the screen at each step. </p>

<p align="center"> <b> Input:</b> </p>
<p align="center">
  <img src="https://user-images.githubusercontent.com/92333856/219492258-77482b8a-08eb-4d27-b603-b1b1a36ad5a6.png">
</p>

<p align="center"> <b> Output:</b> </p>
<p align="center">
  <img src="https://user-images.githubusercontent.com/92333856/219492284-01d9fc66-bb03-4cf5-a157-d9774ab88820.png">
</p>





