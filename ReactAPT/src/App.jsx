import { useState, useEffect } from 'react'
import { Card } from './components/Card'
import { APICard } from './components/APICard'
import produtos from './constants/produtos.json'
import { api } from "./api/rmApi"
import style from './App.module.css'

function App() {
  const [show, setShow] = useState("")
  const [data, setData] = useState([])
  const [page, setPage] = useState("")


  useEffect(() => {
    api.get(`/character/?page=${page}`).then((response) => {
      if(!response.data.results){
        console.log("Vazio")
      }
      setData(response.data.results)
    }).catch((error) => {
      if(error.response.status === 404){
        console.log("Esta pagina nao contem este personagem")
      }
      console.error(error)
    })
  }, [page])

  return (
    <>
    <div className={style.wrapBtns}>
      <button onClick={() => setShow("prod")}>Produtos</button>
      <button onClick={() => setShow("api")}>API</button>
      <button onClick={() => setShow("map")}>Mapa</button>
    </div>
    <div  className={style.wrapPage}>
      <h1>Exercícios de manutenção</h1>
     {show === "prod" &&
        <>
          <h2>Showroom de produtos</h2>
            <div className={style.wrapCardShow}>
            {produtos.map((item) => {
              var item_status;
              item.status == true ? item_status = "🟢" : item_status = "🔴"
              return(
                <div className={style.wrapCard}>
                  <Card name={item.name} desc={item.desc} value={item.value} image={item.image} key={item.id} text={item_status}/>
                </div>
              )
             })}
            </div>
        </>
      }
     {show === "api" &&
        <>
          <h2>Rick and Morty API</h2>
            <div>
               <input type="text" placeholder="1/43" value={page} onChange={(event) => setPage(event.target.value)}/>
            </div>
            <div className={style.wrapCardShow}>
            {data.map((item) => { 
             return(
              <div key={item.id} className={style.wrapCard}>
                <br></br>
                <APICard name={item.name} desc={item.species} value={item.gender} type={item.type} image={item.image} status={item.status} />
                {/* <button onClick={() => {}}>Info</button> */}
              </div>
              
              )
           })}
            </div>
       </>
      }
     {show === "map" &&
        <>
      <h2>Mapa</h2>
          <div>
              mapa aqui
          </div>
         </>
      }
    </div>
    </>
  )
}

export default App
