function Button({ children, text, onClick, className = "" }) {
      return (
          <button className={`btn ${className}`} onClick={onClick}>
                {children || text}
                    </button>
                      );
                      }

                      export default Button;