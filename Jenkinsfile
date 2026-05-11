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
 stage('Execute'){
 steps {
 sh 'mvn exec:java -Dexec.mainClass="com.example.App"'
 }
 }
 }
 post {
 success { echo 'All Selenium tests passed!' }
 failure { echo 'Selenium test failed.' }
 always { echo 'Pipeline execution finished.' }
 }
}
