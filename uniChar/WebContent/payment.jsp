<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/js/bootstrap.bundle.min.js">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="styles/payment-style.css">
    <title>Pagamento</title>
</head>
<body>
    <%@ include file="navbar.html" %>
    <div class="container mt-5 px-5">

        <div class="mb-4">

            <h2>Conferma l'ordine e Paga</h2>
        <span id="span">Fai il pagamento per godere di tutti i benefits</span>
            
        </div>

    <div class="row">

        <div class="col-md-8">
            

            <div class="card p-3">

                <h6 class="text-uppercase white">Dettagli del Pagamento</h6>
                <div class="inputbox mt-3"> <input type="text" name="name" class="form-control" required="required"> <span>Nome intestatario</span> </div>


                <div class="row">

                    <div class="col-md-6">

                        <div class="inputbox mt-3 mr-2"> <input type="text" name="name" class="form-control" required="required"> <i class="fa fa-credit-card"></i> <span>Numero della carta</span> 


                        </div>
                        

                    </div>

                    <div class="col-md-6">

                         <div class="d-flex flex-row">


                             <div class="inputbox mt-3 mr-2"> <input type="text" name="name" class="form-control" required="required"> <span>Data di scadenza</span> </div>

                          <div class="inputbox mt-3 mr-2"> <input type="text" name="name" class="form-control" required="required"> <span>CVV</span> </div>
                             

                         </div>
                        

                    </div>
                    

                </div>

            </div>



        </div>

        <div class="col-md-4">

            <div class="card card-blue p-3 text-white mb-3">

               <span>Devi pagare</span>
                <div class="d-flex flex-row align-items-end mb-3">
                    <h1 class="mb-0 yellow">$549</h1> <span>.99 &euro;</span>
                </div>

             
                    <span>Divertiti e goditi il tuo acquisto</span>
    
                <div class="mt-4 mb-4">


                       


                        <button class="btn btn-outline-warning  px-3">Pay $840</button>


                        

                    </div>
                
            </div>
            
        </div>
        
    </div>
      

  </div>


</body>
</html>