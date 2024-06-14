import json from "../Dados/loja.json" with{type:"json"}
const products = document.getElementById("products");

function dados(){

    for(var i in json){
        var card = document.createElement("div");
        var title = document.createElement("h2");
        var image = document.createElement("img");
        var price = document.createElement("p");
        var quantity = document.createElement("p");

        var green = document.createElement("img");
        var red = document.createElement("img");

        title.textContent = json[i].descricao;
        image.src = json[i].imagem;
        image.setAttribute('class', "product-img");
        price.textContent = "Preço: R$" + json[i].preco;
        quantity.textContent = "Quantidade: " + json[i].quantidade;
        card.setAttribute('class', "card");
        green.src = "bola_verde.png";
        green.setAttribute('class', "ball-img");
        red.src = "bola_vermelho.png";
        red.setAttribute('class', "ball-img");

        card.appendChild(title);
        card.appendChild(image);		
        card.appendChild(price);	
        card.appendChild(quantity);	

        if(json[i].estoque == false){
            card.appendChild(green);

        }
        else{
            card.appendChild(red);

        }
        
        products.appendChild(card);		
        

    }        
}

dados();
