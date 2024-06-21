export const APICard = (api) => {
    return(
        <div>
            <h1>{api.name}</h1>
            <h2>{api.desc}</h2>
            <p>{api.value}</p>
            <p>{api.type}</p>
            <p>Status: {api.status}</p>
            <img src={api.image} alt={api.name} width={150} height={"auto"}/>
        </div>
    )
  }