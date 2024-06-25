# Blog-Java
This is an anonymous blog website implemented using the Spring framework and the Mysql database. The frontend was implemented using html, thymeleaf.
A user without authorization can leave an article and also view other articles.

![](https://github.com/aanastsaa/Blog-Java/blob/main/Снимок%20экрана%202024-03-17%20232349.png)

I used the MVC pattern to implement the project. The implementation itself in the project is divided into different folders for clearer structuring. There is a controllers folder where the direct processing of various requests from the client and the return of results is implemented. The models folder implements the Post model and related logic.

A person can go to a web page and click "Add post", after adding, the post will be saved to the database, which allows you to see a new post after updating the page. In writing the program, models for the Post and a controller were created separately, which allows you to implement certain operations with sweat on the page.

![](https://github.com/aanastsaa/Blog-Java/blob/main/Снимок%20экрана%202024-03-17%20232406.png)
