# CCCS541 assignment 1 REST Plain TEXT

## API COMMANDS
> **Note**: Date gets updated & created inside the script

### @LIST 
`curl 'http://localhost:8088/Assignment/webresources/rest/list'`

### @POST (WITH STRING PARSE)
`curl -Uri 'http://localhost:8088/Assignment/webresources/rest/post' -Method Post -ContentType 'text/plain' -Body 'ID,Title,Description,0.0,Genre,0000'`

### @PUT 

**For Linux / MAC**

`curl -Method PUT http://localhost:8088/Assignment/webresources/rest/put?ID=123 -Body "newID=newImdbId&newTitle=newTitle&newDescription=newDescription&newRating=6.0&newGenre=newGenre&newYear=2023"`

> &newKey=Value can also be omited. Single paramters can be changed. e.g:
`curl -Method PUT http://localhost:8088/Assignment/webresources/rest/put?ID=123 -Body "newTitle=New Title&newRating=8.5"`

**For Windows Powershell**

`Invoke-WebRequest -Method Put -Uri "http://localhost:8088/Assignment/webresources/rest/put?ID=123&newID=newImdbId&newTitle=newTitle&newDescription=newDescription&newRating=6.0&newGenre=newGenre&newYear=2023"`

> &newKey=Value can also be omited. Single paramters can be changed. e.g:
`Invoke-WebRequest -Method Put -Uri "http://localhost:8088/Assignment/webresources/rest/put?ID=123&newDescription=A cool movie&newRating=99.77&"`


### @GET 
`curl 'http://localhost:8088/Assignment/webresources/rest/get?ID=123'`

### @DELETE
`curl 'http://localhost:8088/Assignment/webresources/rest/delete?ID=123' -Method DELETE`

### @Thanks 
`curl 'http://localhost:8088/Assignment/webresources/rest/thanks'`





