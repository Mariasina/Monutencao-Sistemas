import { useState, useEffect } from 'react'
import { Card } from './components/Card'
import { APICard } from './components/APICard'
import produtos from './constants/produtos.json'
import { api } from "./api/rmApi"
import style from './App.module.css'
import { MapContainer, TileLayer, Popup, Marker } from 'react-leaflet'
import 'leaflet/dist/leaflet.css';
import 'leaflet-defaulticon-compatibility/dist/leaflet-defaulticon-compatibility.css';
import "leaflet-defaulticon-compatibility";
import React, { PureComponent } from 'react';
import { LineChart, Line, CartesianGrid, XAxis, YAxis, Tooltip, BarChart, Bar, Cell } from 'recharts';

function App() {
  const [show, setShow] = useState("")
  const [data, setData] = useState([])
  const [page, setPage] = useState("")
  const [name, setName] = useState("")
  const dataGraphics = [
    { name: 'Os Vingadores', uv: 1.518, pv: 2400, amt: 2400 },
    { name: 'O Rei Leão', uv: 1.662, pv: 2400, amt: 2400 },
    { name: 'Jurrasic World: Mundo d...', uv: 1.670, pv: 2400, amt: 2400 },
    { name: 'Homem Aranha: Sem V...', uv: 1.832, pv: 2400, amt: 2400 },
    { name: 'Vingadores: Guerra In...', uv: 2.048, pv: 2400, amt: 2400 },
    { name: 'Star Wars: O Despertar...', uv: 2.069, pv: 2400, amt: 2400 },
    { name: 'Titanic', uv: 2.245, pv: 2400, amt: 2400 },
    { name: 'Avatar: O Caminho da Á...', uv: 2.247, pv: 2400, amt: 2400 },
    { name: 'Vingadores: Ultimato', uv: 2.797, pv: 2400, amt: 2400 },
    { name: 'Avatar', uv: 2.847, pv: 2400, amt: 2400 }];

  const dataGraphicsBar = [
    { name: 'Os Vingadores', uv: 1.518, pv: 2400, amt: 2400 },
    { name: 'O Rei Leão', uv: 1.662, pv: 2400, amt: 2400 },
    { name: 'Jurrasic World: Mundo d...', uv: 1.670, pv: 2400, amt: 2400 },
    { name: 'Homem Aranha: Sem V...', uv: 1.832, pv: 2400, amt: 2400 },
    { name: 'Vingadores: Guerra In...', uv: 2.048, pv: 2400, amt: 2400 },
    { name: 'Star Wars: O Despertar...', uv: 2.069, pv: 2400, amt: 2400 },
    { name: 'Titanic', uv: 2.245, pv: 2400, amt: 2400 },
    { name: 'Avatar: O Caminho da Á...', uv: 2.247, pv: 2400, amt: 2400 },
    { name: 'Vingadores: Ultimato', uv: 2.797, pv: 2400, amt: 2400 },
    { name: 'Avatar', uv: 2.847, pv: 2400, amt: 2400 }];


  useEffect(() => {
    api.get(`/character/?page=${page}`).then((response) => {
      if (!response.data.results) {
        console.log("Vazio")
      }
      setData(response.data.results)
    }).catch((error) => {
      if (error.response.status === 404) {
        alert("Esta pagina nao contem este personagem")
      }
      console.error(error)
    })
  }, [page])

  useEffect(() => {
    api.get(`/character/?name=${name}`).then((response) => {
      if (!response.data.results) {
        console.log("Vazio")
      }
      setData(response.data.results)
    }).catch((error) => {
      if (error.response.status === 404) {
        alert("Esta pagina nao contem este personagem")
      }
      console.error(error)
    })
  }, [name])

  return (
    <>
      <div className={style.wrapBtns}>
        <button onClick={() => setShow("prod")}>Produtos</button>
        <button onClick={() => setShow("api")}>API</button>
        <button onClick={() => setShow("map")}>Mapa</button>
        <button onClick={() => setShow("graphics")}>Gráficos</button>
      </div>
      <div className={style.wrapPage}>
        <h1>Exercícios de manutenção</h1>
        {show === "prod" &&
          <>
            <h2>Showroom de produtos</h2>
            <div className={style.wrapCardShow}>
              {produtos.map((item) => {
                var item_status;
                item.status == true ? item_status = "🟢" : item_status = "🔴"
                return (
                  <div className={style.wrapCard}>
                    <Card name={item.name} desc={item.desc} value={item.value} image={item.image} key={item.id} text={item_status} />
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
              <input type="number" placeholder="1/43" value={page} onChange={(event) => setPage(event.target.value)} />
              <input type="text" placeholder="Pesquisar por nome" value={name} onChange={(event) => setName(event.target.value)} />
            </div>
            <div className={style.wrapCardShow}>
              {data.map((item) => {
                return (
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
            <div className={style.map}>
              <MapContainer center={[-25.4249069, -49.2749302]} zoom={13} scrollWheelZoom={false} style={{ width: "98%", height: "500px" }}>
                <TileLayer
                  attribution='&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
                  url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
                />
                <Marker position={[-25.4249069, -49.2749302]}>
                  <Popup>
                    <a href="https://maps.app.goo.gl/hvHG8SjjYEn3MvVK7" target="_blank">Google Maps</a>
                  </Popup>
                </Marker>
              </MapContainer>
            </div>
          </>
        }
        {show === "graphics" &&
          <>
            <div>
              <h3>Top 10 filmes com maior bilheteria (em bilhões de dólares)</h3>
              <LineChart width={1800} height={500} data={dataGraphics}>
                <Line type="monotone" dataKey="uv" stroke="#8884d8" />
                <CartesianGrid stroke="#ccc" />
                <XAxis dataKey="name" />
                <YAxis />
                <Tooltip />
              </LineChart>
            </div>
            <div>
              
            </div>

          </>

        }
      </div>
    </>
  )
}

export default App
