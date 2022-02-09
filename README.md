# CS445_HW1
This assignment is to learn and get an understanding of inheritance, abstraction, and polymorphism
## Getting Started
The instructions to install, build, and deploy the application are designed to be run on [Ubuntu 20.04.3 LTS (Focal Fossa)] (https://releases.ubuntu.com/20.04.3/ubuntu-20.04.3-desktop-amd64.iso.)

## Instructions
### Installation
Open the terminal

Install Java 16 JDK  
`sudo apt install openjdk-16-jdk-headless`

Install Unzip, if not already installed  
`sudo apt install unzip`
#### Download Files
##### Zip Folder
If you downloaded the repository as a zip file. Go the the directory the zip folder is in. 
Then do,  
`unzip Gladys-Toledo_Rodriguez-CS445-HW-1-main.zip`
##### Git Clone
If you don't have already, install git:  
`sudo apt install git`  

Move into the folder you want the repository to be in.
Once there do,  
`git clone https://github.com/gtoledorodriguez/Gladys-Toledo_Rodriguez-CS445-HW-1.git`

### Build
Enter the cloned/unzipped folder  
`cd Gladys-Toledo_Rodriguez-CS445-HW-1-main/src/java`

Enter the following command to build/compile the files:  
`javac -d . *.java`

### Deploy
Enter the following command to deploy the application:  
`java src/java/TestCreature`
