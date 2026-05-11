pipeline {
 agent any
 stages {
 stage('Clone Repository') {
 steps {
 git branch: 'main',
 url: 'https://github.com/AdityaRaj1010/LabSelenium.git'
 }
 }
 stage('Check Java & Maven') {
 steps {
 sh 'java -version'
 sh 'mvn -version'
 }
 }
 stage('Build Project') {
 steps { sh 'mvn clean install -DskipTests' }
 }
 stage('Selenium Test') {
 steps { sh 'mvn test' }
 }
 stage('Custom Message') {
 steps {
 echo 'Selenium Automation Testing Executed Successfully!'
 }
 }
 stage('Debug Environment') {
    steps {
        sh 'whoami'
        sh 'pwd'
        sh 'echo $HOME'
        sh 'which google-chrome'
        sh 'which chromedriver'
        sh 'google-chrome --version'
        sh 'chromedriver --version'
    }
}
 stage('Execute'){
 steps {
sh 'xvfb-run mvn exec:java -Dexec.mainClass="com.example.App"'
 }
 }
 }
 post {
 success { echo 'All Selenium tests passed!' }
 failure { echo 'Selenium test failed.' }
 always { echo 'Pipeline execution finished.' }
 }
}
