# CCCS541 assignment 1 REST Plain TEXT

## API COMMANDS
> **Note**: 
Date gets updated & created inside the script.
The Port is `8088` for my server but it might be default `8080` on your machine.

### @LIST 
This is a get request which lists all the objects in memory.

`curl 'http://localhost:8088/Assignment/webresources/rest/list'`

### @POST (WITH STRING PARSE)
This is a post request which specifies the parameters for a new object to be added to memory.

`curl -Uri 'http://localhost:8088/Assignment/webresources/rest/post' -Method Post -ContentType 'text/plain' -Body 'ID,Title,Description,0.0,Genre,0000'`

### @PUT 
This is a put request which specifies the object ID and new parameters used to set (update) the targeted object.

**For Linux / MAC**

`curl -Method PUT http://localhost:8088/Assignment/webresources/rest/put?ID=123 -Body "newID=newImdbId&newTitle=newTitle&newDescription=newDescription&newRating=6.0&newGenre=newGenre&newYear=2023"`

&newKey=Value can be omited. Single paramters can be changed. e.g:

`curl -Method PUT http://localhost:8088/Assignment/webresources/rest/put?ID=123 -Body "newTitle=New Title&newRating=8.5"`

**For Windows Powershell**

`Invoke-WebRequest -Method Put -Uri "http://localhost:8088/Assignment/webresources/rest/put?ID=123&newID=newImdbId&newTitle=newTitle&newDescription=newDescription&newRating=6.0&newGenre=newGenre&newYear=2023"`

&newKey=Value can be omited. Single paramters can be changed. e.g:

`Invoke-WebRequest -Method Put -Uri "http://localhost:8088/Assignment/webresources/rest/put?ID=123&newDescription=A cool movie&newRating=99.77&"`


### @GET 
This is a get method which specifies the object ID of the targeted object to be fetched.

`curl 'http://localhost:8088/Assignment/webresources/rest/get?ID=123'`

### @DELETE
This is a delete method which specifies the object ID of the targeted object to be deleted.

`curl 'http://localhost:8088/Assignment/webresources/rest/delete?ID=123' -Method DELETE`

### @Thanks 
This is a get method which displays 'Thank you' !

`curl 'http://localhost:8088/Assignment/webresources/rest/thanks'`





