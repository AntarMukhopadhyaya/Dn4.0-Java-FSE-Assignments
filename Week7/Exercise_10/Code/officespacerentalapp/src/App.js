import "./App.css";
function OfficeCard({ office }) {
  const rentClass = office.rent < 60000 ? "low-rent" : "high-rent";
  return (
    <div className="office-card">
      <h2>{office.name}</h2>
      <img
        src={office.imageUrl}
        alt={`Office space for ${office.name}`}
        className="office-image"
      />
      <p>
        <strong>Address: </strong> {office.address}
      </p>
      <p className={rentClass}>
        <strong>Rent: </strong> ${office.rent.toLocaleString()}
      </p>
    </div>
  );
}

function App() {
  const offices = [
    {
      id: 1,
      name: "Downtown Workspace",
      rent: 55000,
      address: "123 Main St, Metro City",
      imageUrl: "https://placehold.co/300x200?text=Office+1",
    },
    {
      id: 2,
      name: "Uptown Suites",
      rent: 75000,
      address: "456 High St, Metro City",
      imageUrl: "https://placehold.co/300x200?text=Office+2",
    },
    {
      id: 3,
      name: "Suburban Hub",
      rent: 60000,
      address: "789 Side Rd, Metro City",
      imageUrl: "https://placehold.co/300x200?text=Office+3",
    },
  ];

  return (
    <div className="App">
      <header className="App-header">
        <h1> Office Space Rental App</h1>
      </header>
      <div className="office-list">
        {offices.map((office) => (
          <OfficeCard key={office.id} office={office} />
        ))}
      </div>
    </div>
  );
}

export default App;
