async function getsessiondata(){
        
         var sessiondata = await axios.get("http:www.localhost:8081/getsessiondata");

          console.log(sessiondata);
axios.get("http:www.localhost:8081/getsessiondata").then((res)=>{console.log(res)});
          // var tag = document.getElementById("username");
          // tag.innerHTML += "user :"+sessiondata.data;        
          // var select = document.getElementById("subjectid");
          // select.innerHTML += tag1;
        
        }


async function setsessiondata(){

          var username ="rakesh";
        
        axios.post("http:www.localhost:8081/setsessiondata/"+username);

        var sessiondata = await axios.get("http:www.localhost:8081/getsessiondata");

          console.log(sessiondata.data);
                  
          // var select = document.getElementById("subjectid");
          // select.innerHTML += tag1;
        
        }



// ========================================================================================================



async function getsubjects(){
        
          axios.get("http:www.localhost:8081/getsubjects").then((res) => {console.log(res.data);});


          var subjects = await axios.get("http:www.localhost:8081/getsubjects");

        var tag1 = "";
        
          console.log(subjects.data[0]["name"]);
        
          for(let i = 0; i<subjects.data.length; i++){
            tag1 += "<option>"+subjects.data[i]["name"]+"</option>";
          }
        
        
          var select = document.getElementById("subjectid");
          select.innerHTML += tag1;
        
        }



// ========================================================================================================



async function getstudents(){
        
          axios.get("http:www.localhost:8081/getstudents").then((res) => {console.log(res.data);});


          var students = await axios.get("http:www.localhost:8081/getstudents");

        var tag1 = "";
        
          console.log(students.data[0]["name"]);
        
          for(let i = 0; i<students.data.length; i++){
            tag1 += "<option>"+students.data[i]["name"]+"</option>";
          }
        
        
          var select = document.getElementById("studentid");
          select.innerHTML += tag1;
        
        }

        //====================================================================================================
        
         async function getcolleges(){
          getstudents();
          getexams();
          getsubjects();
          // var data;
        
          // axios.get("http:www.localhost:8081/getcolleges").then((res) => { data = res.data; console.log(res.data);});
        
          const  data = await axios.get("http:www.localhost:8081/getcolleges");
        
        
          var tag1 = "";
        
          console.log(data.data[0]["name"]);
        
          for(let i = 0; i<data.data.length; i++){
            tag1 += "<option>"+data.data[i]["name"]+"</option>";
          }
        
        
          var select = document.getElementById("collegeId");
          select.innerHTML += tag1;
        
        //   var tag = "<table border = '2'>";
        
        //   console.log(data.data[0]["name"]);
        
        //   for(let i = 0; i<data.data.length; i++){
        //     tag += "<tr><td>"+data.data[i]["id"]+"</td>"; 
        //     tag += "<td>"+data.data[i]["name"]+"</td></tr>";
        //   }
        
        // tag += "</table>";
        //   console.log(tag)
        
        //   var table = document.getElementById("table");
        //   table.innerHTML += tag;
        }
        



        async function getcollegesstudentsignup(){
          
          // var data;
        
          // axios.get("http:www.localhost:8081/getcolleges").then((res) => { data = res.data; console.log(res.data);});
        
          const  data = await axios.get("http:www.localhost:8081/getcolleges");
        
        
          var tag1 = "";
        
          console.log(data.data[0]["name"]);
        
          for(let i = 0; i<data.data.length; i++){
            tag1 += "<option>"+data.data[i]["name"]+"</option>";
          }
        
        
          var select = document.getElementById("selectcollegeid");
          select.innerHTML += tag1;
        
        //   var tag = "<table border = '2'>";
        
        //   console.log(data.data[0]["name"]);
        
        //   for(let i = 0; i<data.data.length; i++){
        //     tag += "<tr><td>"+data.data[i]["id"]+"</td>"; 
        //     tag += "<td>"+data.data[i]["name"]+"</td></tr>";
        //   }
        
        // tag += "</table>";
        //   console.log(tag)
        
        //   var table = document.getElementById("table");
        //   table.innerHTML += tag;
        }

        //====================================================================================================


        async function getcollegesLandingpage(){
          // getstudents();
          // getexams();
          // getsubjects();
          // // var data;
        
          // axios.get("http:www.localhost:8081/getcolleges").then((res) => { data = res.data; console.log(res.data);});
        
          const  data = await axios.get("http:www.localhost:8081/getcolleges");
        
        
          var tag = "<table border = '2'>";
        
          console.log(data.data[0]["name"]);

          tag += "<tr><th> CollegeId </th> <th> CollegeName </th></tr>"
        
          for(let i = 0; i<data.data.length; i++){
            tag += "<tr><td>"+data.data[i]["id"]+"</td>"; 
            tag += "<td>"+data.data[i]["name"]+"</td></tr>";
          }
        
        tag += "</table> <br></br>";
          console.log(tag)
        
          var table = document.getElementById("table");
          table.innerHTML += tag;
        }
        

        //====================================================================================================

        async function getstudentsLandingpage(){
        
          // axios.get("http:www.localhost:8081/getcolleges").then((res) => { data = res.data; console.log(res.data);});
        
          const  data = await axios.get("http:www.localhost:8081/getstudents");
        
        
          var tag = "<table border = '2'>";
        
          tag += "<tr><th> StudentId </th> <th> StudentName </th></tr>"

          console.log(data.data[0]["name"]);
        
          for(let i = 0; i<data.data.length; i++){
            tag += "<tr><td>"+data.data[i]["id"]+"</td>"; 
            tag += "<td>"+data.data[i]["name"]+"</td></tr>";
          }
        
        tag += "</table> <br></br>";
          console.log(tag)
        
          var table = document.getElementById("table");
          table.innerHTML += tag;
        }
        

        //====================================================================================================


        async function getexams(){
        
          axios.get("http:www.localhost:8081/getexams").then((res) => {console.log(res.data);});


          var exams = await axios.get("http:www.localhost:8081/getexams");

        var tag1 = "";
        
          console.log(exams.data[0]["name"]);
        
          for(let i = 0; i<exams.data.length; i++){
            tag1 += "<option>"+exams.data[i]["name"]+"</option>";
          }
        
        
          var select = document.getElementById("examid");
          select.innerHTML += tag1;
        
        }

// ================================================================================================


async function getsubjectsteachersignup(){
          
          // var data;
        
          // axios.get("http:www.localhost:8081/getcolleges").then((res) => { data = res.data; console.log(res.data);});
        
          const  data = await axios.get("http:www.localhost:8081/getsubjects");
        
        
          var tag1 = "";
        
          console.log(data.data[0]["name"]);
        
          for(let i = 0; i<data.data.length; i++){
            tag1 += "<option>"+data.data[i]["name"]+"</option>";
          }
        
        
          var select = document.getElementById("selectsubjectsid");
          select.innerHTML += tag1;

          }

          // ================================================================================================