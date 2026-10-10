import styles from './styles.module.css';

function PriceDisplay({ price }) {
  console.log(`Rendering PriceDisplay with price: ${price}, key: ${price}`);
    return (
        <div className={styles.wrapper}>
              {/* Adding the key prop forces React to re-mount the div when the price changes */}
                    <div key={price} className={styles.animated}>
                            {`$` + price}
                                  </div>
                                      </div>
                                        );
                                        }

                                        export default PriceDisplay;