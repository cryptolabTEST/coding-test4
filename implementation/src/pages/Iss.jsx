import React, { useEffect, useState } from 'react';
import axios from 'axios';

function Iss() {
  const [curLocation, setCurLocation] = useState('');

  useEffect(() => {
    loadData(setCurLocation);
  }, []);

  return (
    <>
      {/* buttons */}
      <div>
        <button>ISS</button>
        <button onClick={() => loadData(setCurLocation)}>refresh</button>
      </div>
      {/* views */}
      <div>{curLocation}</div>
    </>
  );
}

const loadData = async setFunction => {
  const { data } = await axios.get('http://api.open-notify.org/iss-now.json');
  setFunction(data.iss_position.latitude + ' ' + data.iss_position.longitude);
  axios.post('https://26060a74-07a3-4ba9-9632-1e5a6bc69f4f.mock.pstmn.io', {
    iss_position: {
      latitude: data.iss_position.latitude,
      longitude: data.iss_position.longitude,
    },
  });
};

export default Iss;
