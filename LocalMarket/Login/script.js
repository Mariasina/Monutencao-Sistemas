function login() {
  var nome = $("#nome").val();
  var senha = $("#senha").val();
  const btn = document.querySelector('.exit-img');

  if (nome && senha && nome === "admin" && senha === "admin") {
    const user = {
      name: nome,
      dataEntrada: new Date(),
      id: Math.floor(Math.random() * 100000),
    };

    localStorage.setItem("usuario", JSON.stringify(user));

    window.location.href = "../Loja/loja.html";
  } else {
    const modal = document.querySelector('.modal');
    const actualStyle = modal.style.display;

    if(actualStyle == 'block') {
      modal.style.display = 'none';
    }
    else {
      modal.style.display = 'block';
      btn.addEventListener("click", function () {
        modal.style.display = 'none';
      });
    }
  }
}

let is_visible = false;

document.getElementById('view').addEventListener('click', function() {
  if(is_visible == false){
    document.getElementById('senha').type = 'text';
    is_visible = true;
  }
  else{
    document.getElementById('senha').type = 'password';
    is_visible = false;
  }
});