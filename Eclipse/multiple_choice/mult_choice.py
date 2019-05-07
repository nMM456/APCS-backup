import random

questions = open("questions.txt", "r").read()
answers = open("answers.txt", "r").read()
num = random.randint(1,41)

index = questions.find(str(num)+". ")
end = questions.find(str(num+1)+". ")
print(questions[index:end])

answer = answers.find("Question "+str(num)+": ")
len=len("Question "+str(num)+": ")

print("correct answer:" + answers[answer+len])