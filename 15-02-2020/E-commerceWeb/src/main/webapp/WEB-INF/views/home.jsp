<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
    crossorigin="anonymous">
</head>
<body>





 <header>
        <nav class="navbar  navbar-expand-md navbar-dark display-5 bg-dark">
            <button type="button" class="navbar-toggler ml-auto" data-toggle="collapse" data-target="#navbar1">
                <span class="navbar-toggler-icon"> </span>
            </button>
            <div id="navbar1" class="collapse navbar-collapse ml-auto">
                <ul class="navbar-nav justify-content-around w-100 text-center">
                    <li class="nav-item"><a href="home.html" class="nav-link ">HOME</a></li>
                    <li class="nav-item"><a href="placeorder.html" class="nav-link ">PLACE ORDER</a></li>
                    <li class="nav-item"><a href="admin" class="nav-link ">ADMIN</a></li>
                    <li class="nav-item"><a href="user" class="nav-link">USER</a></li>
                </ul>
            </div>
        </nav>


        <!-- <div class="bg-dark-50"> -->
            <div class="container-fluid w-100" style="background-color: darkgoldenrod;">
                <H2 class="text-center display-3 text-dark my-3">E-Commerce</H2>
            </div>
        </div>


    </header>

    <div class="container w-100">
        
        <div id="carouselExampleControls" class="carousel slide w-100" data-ride="carousel">
            <div class="carousel-inner">
              <div class="carousel-item active">
                <img class="d-block w-100" src="resources/images/corousal1.PNG"  alt="First slide">
              </div>
              <div class="carousel-item">
                <img class="d-block w-100" src="resources/images/corousal2.PNG" alt="Second slide">
              </div>
              <div class="carousel-item">
                <img class="d-block w-100" src="resources/images/corousal3.PNG" alt="Third slide">
              </div>
            </div>
            <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
              <span class="carousel-control-prev-icon" aria-hidden="true"></span>
              <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
              <span class="carousel-control-next-icon" aria-hidden="true"></span>
              <span class="sr-only">Next</span>
            </a>
          </div> </div>

          <div class="card-deck p-5">
            <div class="card col-4 w-50 m-5 bg-dark">
                <div class="card-body">
                    <h4 class="card-title text-light text-center">A</h4>
                    <img class="card-img-top" src="./assets/images/card1.jpg" alt="" >
                    <div class="float-left">
                      <button class="btn btn-dark btn btn-outline-light" data-container="body" data-toggle="popover" 
                      data-placement="bottom" data-content="INR 200">
                        Check Price
                      </button>
                    </div>
                    <div class="float-right">
                        <a href="viewproduct.html" class="btn btn-dark btn-outline-light">ViewProduct</a>
                    </div>
                    
                </div class="card-body">
            </div class="card"> 
            <div class="card col-4 w-50 m-5 bg-dark">
                <div class="card-body">
                    <h4 class="card-title text-center text-light">B</h4>
                    <img class="card-img-top" src="./assets/images/card1.jpg" alt="">
                    <div class="float-left">
                    <button class="btn btn-dark btn btn-outline-light" data-container="body" data-toggle="popover" 
                      data-placement="bottom" data-content="INR 300">
                        Check Price
                      </button>
                    </div>
                    <div class="float-right">
                        <a href="viewproduct.html" class="btn btn-dark btn-outline-light">ViewProduct</a>
                    </div>
                    
                </div>
            </div>
            <div class="card col-4 w-50 m-5 bg-dark">
                <div class="card-body">
                    <h4 class="card-title text-center text-light">C</h4>
                    <img class="card-img-top" src="./assets/images/card1.jpg" alt="">
                    <div class="float-left">
                      <button class="btn btn-dark btn btn-outline-light" data-container="body" data-toggle="popover" 
                      data-placement="bottom" data-content="INR 400">
                        Check Price
                      </button>
                    </div>
                    <div class="float-right">
                        <a href="viewproduct.html" class="btn btn-dark btn-outline-light">ViewProduct</a>
                    </div>
                    
                </div>
            </div>
            
          </div>
          </div>
          
          <div class="card-deck p-5">
            <div class="card col-4 w-50 m-5 bg-dark">
                <div class="card-body">
                    <h4 class="card-title text-light text-center">D</h4>
                    <img class="card-img-top" src="./assets/images/card1.jpg" alt="">
                    <div class="float-left">
                      <button class="btn btn-dark btn btn-outline-light" data-container="body" data-toggle="popover" 
                      data-placement="bottom" data-content="INR 50">
                        Check Price
                      </button>
                    </div>
                    <div class="float-right">
                        <a href="viewproduct.html" class="btn btn-dark btn-outline-light">ViewProduct</a>
                    </div>
                    
                </div class="card-body">
            </div class="card"> 
            <div class="card col-4 w-50 m-5 bg-dark">
                <div class="card-body">
                    <h4 class="card-title text-center text-light">E</h4>
                    <img class="card-img-top" src="./assets/images/card1.jpg" alt="">
                    <div class="float-left">
                      <button class="btn btn-dark btn btn-outline-light" data-container="body" data-toggle="popover" 
                      data-placement="bottom" data-content="INR 50">
                        Check Price
                      </button>
                    </div>
                    <div class="float-right">
                        <a href="viewproduct.html" class="btn btn-dark btn-outline-light">ViewProduct</a>
                    </div>
                    
                </div>
            </div>
            <div class="card col-4 w-50 m-5 bg-dark">
                <div class="card-body">
                    <h4 class="card-title text-center text-light">F</h4>
                    <img class="card-img-top" src="./assets/images/card1.jpg" alt="">
                    <div class="float-left">
                      <button class="btn btn-dark btn btn-outline-light" data-container="body" data-toggle="popover" 
                      data-placement="top" data-content="INR 60">
                        Check Price
                      </button>
                    </div>
                    <div class="float-right">
                        <a href="viewproduct.html" class="btn btn-dark btn-outline-light">ViewProduct</a>
                    </div>
                    
                </div>
            </div>
          </div>

          <footer class="page-footer font-small blue bg-dark text-light">
            <div class="footer-copyright text-center py-3 bg-dark text-light">© 2020 Copyright:
                <a href="#">E-commerce</a>
              </div>
          </footer>



<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
          crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
          crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T"
          crossorigin="anonymous"></script>

<script>
    function openNav() {
      document.getElementById("mySidenav").style.width = "250px";
      document.getElementById("main").style.marginLeft = "250px";
    }
    
    function closeNav() {
      document.getElementById("mySidenav").style.width = "0";
      document.getElementById("main").style.marginLeft= "0";
    }
    </script>


</body>
</html>