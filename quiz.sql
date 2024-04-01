-- Database: quiz

-- DROP DATABASE IF EXISTS quiz;

CREATE DATABASE quiz
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'en_US.UTF-8'
    LC_CTYPE = 'en_US.UTF-8'
    LOCALE_PROVIDER = 'libc'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
	
	CREATE TABLE Topic
(
    Id SERIAL PRIMARY KEY,
    title CHARACTER VARYING(100)
);

CREATE TABLE Question
(
    Id SERIAL PRIMARY KEY,
    question CHARACTER VARYING(300),
	topicId INTEGER REFERENCES Topic (Id)
);

CREATE TABLE Answer
(
    Id SERIAL PRIMARY KEY,
    answerOption CHARACTER VARYING(300),
    correctFlag BOOLEAN DEFAULT false,
	questionId INTEGER REFERENCES Question (Id)
);

INSERT INTO Topic (Id, title)
VALUES
(1, 'Java'),
(2, 'CSS'),
(3, 'HTML');

INSERT INTO Question (Id, question, topicId)
VALUES
(1, 'Что называется объектом в ООП?',1),
(2, 'Какие существуют модификаторы доступа?',1),
(3, 'В какой строке содержится корректный синтаксис?',2),
(4, 'Какая разница между элементами div и span?',3);

INSERT INTO Answer (Id, answerOption, correctFlag,questionId)
VALUES
(1, 'То, что обладает состоянием и поведением.',true,1),
(2, 'То, что имеет четкие границы и обладает состоянием и поведением.',false,1),
(3, 'То, что имеет определенную структуру и свойства.',false,1),
(4, 'То, что обладает определенными свойствами.',false,1),
	
(5, 'private,default,protected,final',false,2),
(6, 'Никакие',false,2),
(7, 'private,default,protected,public',true,2),
	
(8, 'body:color=black',false,3),
(9, 'body{color:black}',true,3),
(10, '{body;color:black}',false,3),
(11, '{body:color=black}',false,3),
(12, 'body{color=black}',false,3),
	
(13, 'Никакой',false,4),
(14, 'Div — строчный элемент, а span — блочный элемент. ',false,4),
(15, 'Div — блочный элемент, а span — строчный элемент. ',true,4);

update Question set question='Какие существуют модификаторы доступа?' where Id=2;
update Question set question='Что называется объектом в ООП?' where Id=1;


select * from topic t
join Question q on t.Id=q.topicId
join answer a on a.questionId=q.Id;

