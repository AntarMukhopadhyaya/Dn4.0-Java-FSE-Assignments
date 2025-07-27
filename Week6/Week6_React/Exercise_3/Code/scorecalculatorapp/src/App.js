import logo from './logo.svg';
import './App.css';
import { CalculatorScore } from './components/CalculatorScore';

function App() {
  return (
    <div className="App">
    <CalculatorScore name={"Antar"} school={"KV Coochbehar"} total={289} goal={3} />
    </div>
  );
}

export default App;
